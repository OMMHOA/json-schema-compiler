package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class PatternRestriction extends AbstractRestriction<String> {
    @Override
    protected String convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toString(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        if (!jsonNode.isTextual()) return true;
        return jsonNode.asText().matches(value);
    }

    public PatternRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    PatternRestriction() {
    }
}
