package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Set;

public class MinimumRestriction extends ARestriction<Double> {
    private boolean isExclusive = false;

    public MinimumRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    @Override
    protected Double convertValue(JSONParser.ValueContext value) {
        return ValueConverter.toDouble(value);
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return isExclusive ? jsonNode.asDouble() > value : jsonNode.asDouble() >= value;
    }

    @Override
    public void apply(Set<ExtraRestriction> extraRestrictions) {
        isExclusive = extraRestrictions.contains(ExtraRestriction.exclusiveMinimum);
    }

    MinimumRestriction() {
    }

    void setExclusive(boolean exclusive) {
        isExclusive = exclusive;
    }
}
