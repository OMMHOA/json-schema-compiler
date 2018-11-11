package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Set;

public interface Restriction {
    boolean validate(JsonNode jsonNode);

    void apply(Set<ExtraRestriction> extraRestrictions);
}
