package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;

public interface Restriction {
    boolean validate(JsonNode jsonNode);
}
