package hu.bme.aut.thesis.json.schema.compiler.model;


import com.fasterxml.jackson.databind.JsonNode;

public interface Restriction {
    Boolean validate(JsonNode jsonNode);
}
