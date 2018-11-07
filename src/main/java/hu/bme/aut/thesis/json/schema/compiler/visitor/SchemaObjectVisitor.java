package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.TypeRestriction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static hu.bme.aut.thesis.json.schema.compiler.model.Constants.*;

public class SchemaObjectVisitor extends JSONBaseVisitor<SchemaNode> {
    private static Logger LOGGER = LoggerFactory.getLogger(SchemaObjectVisitor.class);
    private List<JSONParser.ObjContext> childObjects = new ArrayList<>();
    private List<JSONParser.ObjContext> patternChildObjects = new ArrayList<>();
    private SchemaNode schemaNode = new SchemaNode();

    @FunctionalInterface
    private interface RestrictionInitiator {
        Restriction initiate(JSONParser.ValueContext valueContext);
    }

    private static Map<String, RestrictionInitiator> restrictionMap = new HashMap<>();

    static {
        restrictionMap.put(TYPE, TypeRestriction::new);
    }

    @Override
    public SchemaNode visitObj(JSONParser.ObjContext obj) {
        obj.pair().forEach(this::processPairs);
        addChildren(childObjects, schemaNode::addChild);
        addChildren(patternChildObjects, schemaNode::addPatternChild);
        return schemaNode;
    }

    private void processPairs(JSONParser.PairContext pair) {
        String pairKey = pair.STRING().getText();
        if (restrictionMap.containsKey(pairKey)) {
            schemaNode.addRestriction(restrictionMap.get(pairKey).initiate(pair.value()));
        } else if (PROPERTIES.equals(pairKey)) {
            addChildObject(pair.value().obj());
        } else if (PATTERN_PROPERTIES.equals(pairKey)) {
            addPatternChildObject(pair.value().obj());
        } else {
            LOGGER.warn("Key {} not recognized!", pairKey);
        }
    }

    private void addChildObject(JSONParser.ObjContext childObj) {
        if (childObjects == null)
            childObjects = new ArrayList<>();
        childObjects.add(childObj);
    }

    private void addPatternChildObject(JSONParser.ObjContext childObj) {
        if (patternChildObjects == null)
            patternChildObjects = new ArrayList<>();
        patternChildObjects.add(childObj);
    }

    @FunctionalInterface
    private interface ObjectWithAddChild {
        void addChild(String name, SchemaNode child);
    }

    private void addChildren(List<JSONParser.ObjContext> childObjects, ObjectWithAddChild schemaNode) {
        if (childObjects != null) {
            for (JSONParser.ObjContext childObj : childObjects) {
                for (JSONParser.PairContext pair : childObj.pair()) {
                    schemaNode.addChild(pair.STRING().getText(), pair.value().obj().accept(new SchemaObjectVisitor()));
                }
            }
        }
    }
}
