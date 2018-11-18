package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MinItemsRestriction extends ARestriction<Integer> {
    @Override
    protected Integer convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toInt(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return jsonNode.size() >= value;
    }

    public MinItemsRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    public MinItemsRestriction(int value) {
        this.value = value;
    }

    MinItemsRestriction() {
    }
}
