package hu.bme.aut.thesis.json.schema.compiler.model.numbertype;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.Restriction;

public class NumberRestriction implements Restriction {
    @Override
    public Boolean validate(JsonNode jsonNode) {
        return null;
    }
}
