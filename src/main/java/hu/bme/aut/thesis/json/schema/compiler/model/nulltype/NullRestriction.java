package hu.bme.aut.thesis.json.schema.compiler.model.nulltype;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.Restriction;

public class NullRestriction implements Restriction {
    @Override
    public Boolean validate(JsonNode jsonNode) {
        return null;
    }
}
