package hu.bme.aut.thesis.json.schema.compiler.model.nulltype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaNull extends JsonSchemaNode {
    public JsonSchemaNull() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("null");
    }
}
