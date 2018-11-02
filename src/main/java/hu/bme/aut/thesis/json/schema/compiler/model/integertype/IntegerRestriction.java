package hu.bme.aut.thesis.json.schema.compiler.model.integertype;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.Restriction;


public class IntegerRestriction implements Restriction {
    @Override
    public Boolean validate(JsonNode jsonNode) {
        return null;
    }
}
