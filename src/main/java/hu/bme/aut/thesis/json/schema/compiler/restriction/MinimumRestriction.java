package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MinimumRestriction extends AbstractRestriction<Double> {
    public MinimumRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    @Override
    protected Double convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toDouble(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return jsonNode.asDouble() >= value;
    }

    MinimumRestriction() {
    }
}
