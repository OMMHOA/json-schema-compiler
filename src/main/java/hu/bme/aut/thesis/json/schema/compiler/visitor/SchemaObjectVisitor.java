package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static hu.bme.aut.thesis.json.schema.compiler.model.Constants.*;
import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class SchemaObjectVisitor extends JSONBaseVisitor<SchemaNode> {
    private static Logger LOGGER = LoggerFactory.getLogger(SchemaObjectVisitor.class);
    private SchemaNode schemaNode = new SchemaNode();

    @FunctionalInterface
    private interface RestrictionInitiator {
        Restriction initiate(JSONParser.ValueContext valueContext);
    }

    private static Map<String, RestrictionInitiator> restrictionMap = new HashMap<>();
    private static Set<String> metaKeywords = new HashSet<>(2);

    static {
        metaKeywords.add(TITLE);
        metaKeywords.add(DESCRIPTION);

        restrictionMap.put(MAX_LENGTH, MaxLengthRestriction::new);
        restrictionMap.put(MAXIMUM, MaximumRestriction::new);
        restrictionMap.put(MIN_LENGTH, MinLengthRestriction::new);
        restrictionMap.put(MINIMUM, MinimumRestriction::new);
        restrictionMap.put(PATTERN, PatternRestriction::new);
        restrictionMap.put(PROPERTIES, PropertiesRestriction::new);
        restrictionMap.put(REQUIRED, RequiredRestriction::new);
        restrictionMap.put(TYPE, TypeRestriction::new);
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
            schemaNode.addRestriction(restrictionInitiator.initiate(pair.value()));
            LOGGER.debug("Adding restriction: " + pairKey);
        } else if ((extraRestriction = ExtraRestriction.get(pairKey)) != null && isTrue(pair.value().BOOLEAN())){
            schemaNode.addExtraRestriction(extraRestriction);
            LOGGER.debug("Adding extra restriction: " + pairKey);
        } else {
            LOGGER.warn("Key '{}' not recognized!", pairKey);
        }
    }

    private boolean isTrue(TerminalNode aBoolean) {
        return aBoolean != null && Boolean.parseBoolean(aBoolean.getText());
    }
}
