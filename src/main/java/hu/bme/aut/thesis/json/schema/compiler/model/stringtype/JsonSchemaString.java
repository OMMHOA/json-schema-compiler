package hu.bme.aut.thesis.json.schema.compiler.model.stringtype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaString extends JsonSchemaNode {
    public JsonSchemaString() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("string");
    }
}
