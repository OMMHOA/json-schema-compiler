package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.Type;

import java.util.Map;

public class UniqueItemsRestriction extends ARestriction<Boolean> {
    @Override
    protected Boolean convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toBoolean(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        if (!value) return true;
        int size = jsonNode.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Type.jsonNodesEqual(jsonNode.get(i), jsonNode.get(j)))
                    return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) { }

    public UniqueItemsRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    UniqueItemsRestriction() {
    }
}
