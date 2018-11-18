package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.Type;

import java.util.Map;

public class UniqueItemsRestriction implements Restriction {
    @Override
    public boolean validate(JsonNode jsonNode) {
        int size = jsonNode.size();
        if (size < 2) return true;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Type.match(jsonNode.get(i), jsonNode.get(j)))
                    return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) { }
}
