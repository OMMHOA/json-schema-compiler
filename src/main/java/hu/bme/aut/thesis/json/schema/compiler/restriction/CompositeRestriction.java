package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Map;

public class CompositeRestriction implements Restriction {
    private Restriction[] restrictions;

    public CompositeRestriction(Restriction... restrictions) {
        this.restrictions = restrictions;
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        for (Restriction restriction : restrictions) {
            if (!restriction.validate(jsonNode)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) {

    }
}
