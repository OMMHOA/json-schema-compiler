package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class MaxItemsRestriction extends ARestriction<Integer> {
    @Override
    protected Integer convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toInt(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return false;
    }
}
