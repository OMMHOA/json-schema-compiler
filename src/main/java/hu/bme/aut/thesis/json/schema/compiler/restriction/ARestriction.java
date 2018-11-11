package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Set;

public abstract class ARestriction<T> implements Restriction {
    protected T value;

    ARestriction(JSONParser.ValueContext value) {
        this.value = convertValue(value);
    }

    protected abstract T convertValue(JSONParser.ValueContext value);

    @Override
    public abstract boolean validate(JsonNode jsonNode);

    // For testing
    ARestriction() {}

    void setValue(T value) {
        this.value = value;
    }

    @Override
    public void apply(Set<ExtraRestriction> extraRestrictions) { }
}
