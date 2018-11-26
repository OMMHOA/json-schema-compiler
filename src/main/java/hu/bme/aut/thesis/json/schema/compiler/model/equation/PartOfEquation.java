package hu.bme.aut.thesis.json.schema.compiler.model.equation;

import com.fasterxml.jackson.databind.JsonNode;

public interface PartOfEquation {
    EquationValue evaluate(JsonNode jsonNode);
}
