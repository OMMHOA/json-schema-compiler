package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class JsonSchemaNode {
    protected Collection<String> allowedRestrictions;
    private List<Restriction> restrictions;
    private List<JsonSchemaNode> children;

    public JsonSchemaNode() {
        restrictions = new ArrayList<>();
        children = new ArrayList<>();
        initAllowedRestrictions();
    }

    protected abstract void initAllowedRestrictions();

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

    public void addChild(JsonSchemaNode node) {
        children.add(node);
    }

    public List<Restriction> getRestrictions() {
        return Collections.unmodifiableList(restrictions);
    }

    public List<JsonSchemaNode> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
