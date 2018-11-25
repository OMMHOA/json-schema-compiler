package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.ExtraRestriction;

import java.util.*;

public class SchemaNode {
    private List<Restriction> restrictions;
    private Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions;

    public Boolean validate(JsonNode jsonNode) {
        if (restrictions == null || restrictions.size() == 0) return true;
        for (Restriction restriction : restrictions) {
            if (!restriction.validate(jsonNode)) {
                return false;
            }
        }
        return true;
    }

    public void addRestriction(Restriction restriction) {
        if (restrictions == null) {
            restrictions = new ArrayList<>();
        }
        restrictions.add(restriction);
    }

    public void addExtraRestriction(ExtraRestriction extraRestriction, JSONParser.ValueContext value) {
        if (extraRestrictions == null) {
            extraRestrictions = new HashMap<>();
        }
        extraRestrictions.put(extraRestriction, value);
    }

    public void applyExtraRestrictions() {
        if (extraRestrictions != null && restrictions != null) {
            restrictions.forEach(restriction -> restriction.apply(extraRestrictions));
        }
    }

    public List<Restriction> getRestrictions() {
        return Collections.unmodifiableList(restrictions);
    }

    public Map<ExtraRestriction, JSONParser.ValueContext> getExtraRestrictions() {
        return Collections.unmodifiableMap(extraRestrictions);
    }
}
