package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MultipleOfRestriction extends ARestriction<Double> {
    @Override
    protected Double convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toDouble(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return jsonNode.asDouble() % value == 0;
    }

    public MultipleOfRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    public MultipleOfRestriction() {
    }
}
