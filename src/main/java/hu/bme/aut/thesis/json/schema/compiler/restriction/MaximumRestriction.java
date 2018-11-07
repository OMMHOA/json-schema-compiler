package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MaximumRestriction extends AbstractRestriction<Double> {
    public MaximumRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    @Override
    protected Double convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toDouble(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return jsonNode.asDouble() <= value;
    }

    MaximumRestriction() {
    }
}
