package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;

import java.util.*;

public class SchemaNode {
    private List<Restriction> restrictions = new ArrayList<>();
    private Map<String, SchemaNode> children;
    private Map<String, SchemaNode> patternChildren = new HashMap<>();

    public Boolean validate(JsonNode jsonNode) {
        for (Restriction restriction : restrictions) {
            if (!restriction.validate(jsonNode)) {
                return false;
            }
        }
        return true;
    }

    public void addRestriction(Restriction restriction) {
        restrictions.add(restriction);
    }

    public List<Restriction> getRestrictions() {
        return Collections.unmodifiableList(restrictions);
    }

    public void addChild(String name, SchemaNode child) {
        if (children == null)
            children = new HashMap<>();
        children.put(name, child);
    }

    public void addPatternChild(String name, SchemaNode child) {
        if (patternChildren == null)
            patternChildren = new HashMap<>();
        patternChildren.put(name, child);
    }

    public Map<String, SchemaNode> getChildren() {
        return children;
    }

    public Map<String, SchemaNode> getPatternChildren() {
        return patternChildren;
    }
}
