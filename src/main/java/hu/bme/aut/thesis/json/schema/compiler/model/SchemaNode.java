package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchemaNode {
    private List<Restriction> restrictions = new ArrayList<>();

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
}
