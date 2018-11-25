package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Map;

public class ValueRestriction implements Restriction {
    @Override
    public boolean validate(JsonNode jsonNode) {
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) {

    }
}
