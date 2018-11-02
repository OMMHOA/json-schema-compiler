package hu.bme.aut.thesis.json.schema.compiler.model.arraytype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaArray extends JsonSchemaNode {
    public JsonSchemaArray() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("array");
    }
}
