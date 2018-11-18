package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

import java.util.Map;
import java.util.Set;

public interface Restriction {
    boolean validate(JsonNode jsonNode);

    void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions);
}
