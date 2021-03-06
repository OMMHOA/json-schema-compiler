package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.Parser;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.*;
import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;
import static hu.bme.aut.thesis.json.schema.compiler.visitor.Utils.warnValue;

public class ObjectVisitor extends JSONBaseVisitor<SchemaNode> {
    private static Logger LOGGER = LoggerFactory.getLogger(ObjectVisitor.class);
    private SchemaNode schemaNode = new SchemaNode();

    @FunctionalInterface
    private interface RestrictionInitiator {
        Restriction initiate(JSONParser.ValueContext valueContext);
    }

    private static Map<String, RestrictionInitiator> restrictionMap = new HashMap<>();
    private static Set<String> metaKeywords = new HashSet<>(2);

    private static PropertiesInitiator propertiesInitiator = new PropertiesInitiator();
    private static RestrictionInitiator exactItemsInitiator = value ->
    {
        int size = value.obj() == null ? value.array().value().size() : 1;
        return new CompositeRestriction(
                new ItemsRestriction(value),
                new MinItemsRestriction(size),
                new MaxItemsRestriction(size)
        );
    };


    static {
        metaKeywords.add(TITLE);
        metaKeywords.add(DESCRIPTION);

        restrictionMap.put(EXACT_ITEMS, exactItemsInitiator);
        restrictionMap.put(ITEMS, ItemsRestriction::new);
        restrictionMap.put(MAX_PROPERTIES, MaxItemsRestriction::new);
        restrictionMap.put(MAX_ITEMS, MaxItemsRestriction::new);
        restrictionMap.put(MAX_LENGTH, MaxLengthRestriction::new);
        restrictionMap.put(MAXIMUM, MaximumRestriction::new);
        restrictionMap.put(MIN_PROPERTIES, MinItemsRestriction::new);
        restrictionMap.put(MIN_ITEMS, MinItemsRestriction::new);
        restrictionMap.put(MIN_LENGTH, MinLengthRestriction::new);
        restrictionMap.put(MULTIPLE_OF, MultipleOfRestriction::new);
        restrictionMap.put(MINIMUM, MinimumRestriction::new);
        restrictionMap.put(PATTERN, PatternRestriction::new);
        restrictionMap.put(PATTERN_PROPERTIES, propertiesInitiator::addPatternProperties);
        restrictionMap.put(PROPERTIES, propertiesInitiator::addProperties);
        restrictionMap.put(REQUIRED, RequiredRestriction::new);
        restrictionMap.put(TYPE, TypeRestriction::new);
        restrictionMap.put(UNIQUE_ITEMS, UniqueItemsRestriction::new);
        restrictionMap.put(VALUE, valueContext -> Parser.parseEquation(unquote(valueContext.STRING().getText())));
    }

    @Override
    public SchemaNode visitObj(JSONParser.ObjContext obj) {
        obj.pair().forEach(this::processPairs);
        schemaNode.applyExtraRestrictions();
        return schemaNode;
    }

    private void processPairs(JSONParser.PairContext pair) {
        String pairKey = unquote(pair.STRING().getText());
        RestrictionInitiator restrictionInitiator;
        ExtraRestriction extraRestriction;
        if (metaKeywords.contains(pairKey)) return;
        if ((restrictionInitiator = restrictionMap.get(pairKey)) != null) {
            LOGGER.debug("Restriction initiator for key '{}' recognized.", pairKey);
            Restriction restriction = restrictionInitiator.initiate(pair.value());
            if (restriction == null) {
                LOGGER.warn("Failed to initiate restriction for key '{}'. Skipping...", pairKey);
                warnValue(pair.value(), LOGGER);
                return;
            }
            LOGGER.debug("Adding restriction for key: " + pairKey);
            schemaNode.addRestriction(restriction);
        } else if ((extraRestriction = ExtraRestriction.get(pairKey)) != null) {
            LOGGER.debug("Adding extra restriction for key: " + pairKey);
            schemaNode.addExtraRestriction(extraRestriction, pair.value());
        } else {
            LOGGER.warn("Key '{}' not recognized!", pairKey);
        }
    }

    private static class PropertiesInitiator {
        PropertiesRestriction propertiesRestriction;

        Restriction addProperties(JSONParser.ValueContext value) {
            if (propertiesRestriction == null) {
                propertiesRestriction = new PropertiesRestriction(value);
            } else {
                propertiesRestriction.addProperties(value);
            }
            return propertiesRestriction;
        }

        Restriction addPatternProperties(JSONParser.ValueContext value) {
            if (propertiesRestriction == null) {
                propertiesRestriction = new PropertiesRestriction(value, true);
            } else {
                propertiesRestriction.addPatternProperties(value);
            }
            return propertiesRestriction;
        }
    }
}
