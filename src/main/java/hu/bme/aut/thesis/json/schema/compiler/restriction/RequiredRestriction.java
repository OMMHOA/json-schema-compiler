package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class RequiredRestriction extends ARestriction<Set<String>> {
    public RequiredRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    @Override
    protected Set<String> convertValue(JSONParser.ValueContext value) {
        return value.array().value().stream()
                .map(JSONParser.ValueContext::STRING)
                .filter(Objects::nonNull)
                .map(str -> unquote(str.getText()))
                .collect(Collectors.toSet());
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        int requiredFieldsCount = 0;
        while (fields.hasNext()) {
            if (value.contains(fields.next().getKey())) {
                requiredFieldsCount++;
            }
        }
        return requiredFieldsCount == value.size();
    }

    RequiredRestriction() { }
}
