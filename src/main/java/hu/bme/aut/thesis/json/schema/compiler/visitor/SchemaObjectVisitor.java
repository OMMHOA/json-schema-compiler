package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static hu.bme.aut.thesis.json.schema.compiler.model.Constants.*;

public class SchemaObjectVisitor extends JSONBaseVisitor<SchemaNode> {
    private static Logger LOGGER = LoggerFactory.getLogger(SchemaObjectVisitor.class);
    private SchemaNode schemaNode = new SchemaNode();

    @FunctionalInterface
    private interface RestrictionInitiator {
        Restriction initiate(JSONParser.ValueContext valueContext);
    }

    private static Map<String, RestrictionInitiator> restrictionMap = new HashMap<>();

    static {
        restrictionMap.put(TYPE, TypeRestriction::new);
        restrictionMap.put(MINIMUM, MinimumRestriction::new);
        restrictionMap.put(MAXIMUM, MaximumRestriction::new);
        restrictionMap.put(MIN_LENGTH, MinLengthRestriction::new);
        restrictionMap.put(MAX_LENGTH, MaxLengthRestriction::new);
        restrictionMap.put(PATTERN, PatternRestriction::new);
        restrictionMap.put(PROPERTIES, PropertiesRestriction::new);
    }

    @Override
    public SchemaNode visitObj(JSONParser.ObjContext obj) {
        obj.pair().forEach(this::processPairs);
        return schemaNode;
    }

    private void processPairs(JSONParser.PairContext pair) {
        String pairKey = pair.STRING().getText();
        if (restrictionMap.containsKey(pairKey)) {
            schemaNode.addRestriction(restrictionMap.get(pairKey).initiate(pair.value()));
            LOGGER.debug("Adding restriction for " + pairKey);
        } else {
            LOGGER.warn("Key {} not recognized!", pairKey);
        }
    }
}
