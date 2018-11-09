package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TypeRestriction extends AbstractRestriction<String> {
    private static final Map<String, Function<JsonNode, Boolean>> SUPPORTED_TYPES = new HashMap<>(7);

    static {
        SUPPORTED_TYPES.put("array", JsonNode::isArray);
        SUPPORTED_TYPES.put("boolean", JsonNode::isBoolean);
        SUPPORTED_TYPES.put("integer", JsonNode::isInt);
        SUPPORTED_TYPES.put("null", JsonNode::isNull);
        SUPPORTED_TYPES.put("number", JsonNode::isNumber);
        SUPPORTED_TYPES.put("object", JsonNode::isObject);
        SUPPORTED_TYPES.put("string", JsonNode::isTextual);
    }

    public TypeRestriction(JSONParser.ValueContext value) {
        super(value);
        if (!SUPPORTED_TYPES.keySet().contains(this.value)) {
            throw new SchemaException("Value of key type should be "
                    + String.join("/", SUPPORTED_TYPES.keySet()));
        }
    }

    @Override
    protected String convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toString(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return SUPPORTED_TYPES.get(value).apply(jsonNode);
    }

    TypeRestriction() { }
}
