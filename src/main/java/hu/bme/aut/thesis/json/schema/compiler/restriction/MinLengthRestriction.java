package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MinLengthRestriction extends ARestriction<Integer> {
    public MinLengthRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    @Override
    protected Integer convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toInt(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return jsonNode.asText().length() >= value;
    }

    MinLengthRestriction() {
    }
}
