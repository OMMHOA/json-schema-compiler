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
        for (int i = 0; i < jsonNode.size(); i++) {
            if (jsonNode.get(i).asDouble() % value != 0) {
                return false;
            }
        }
        return true;
    }

    public MultipleOfRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    public MultipleOfRestriction() {
    }
}
