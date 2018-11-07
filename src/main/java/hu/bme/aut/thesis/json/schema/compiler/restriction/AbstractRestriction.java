package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public abstract class AbstractRestriction<T> implements Restriction {
    protected T value;

    AbstractRestriction(JSONParser.ValueContext value) {
        this.value = convertValue(value);
    }

    protected abstract T convertValue(JSONParser.ValueContext value);

    @Override
    public abstract boolean validate(JsonNode jsonNode);

    // For testing
    AbstractRestriction() {}

    void setValue(T value) {
        this.value = value;
    }
}
