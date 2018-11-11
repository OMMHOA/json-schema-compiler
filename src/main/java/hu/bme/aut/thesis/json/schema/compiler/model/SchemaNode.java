package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.ExtraRestriction;

import java.util.*;

public class SchemaNode {
    private List<Restriction> restrictions;
    private Set<ExtraRestriction> extraRestrictions;

    public Boolean validate(JsonNode jsonNode) {
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

    public List<Restriction> getRestrictions() {
        return Collections.unmodifiableList(restrictions);
    }

    public void addExtraRestriction(ExtraRestriction extraRestriction) {
        if (extraRestrictions == null) {
            extraRestrictions = new HashSet<>();
        }
        extraRestrictions.add(extraRestriction);
    }

    public void applyExtraRestrictions() {
        if (extraRestrictions != null && restrictions != null) {
            restrictions.forEach(restriction -> restriction.apply(extraRestrictions));
        }
    }
}
