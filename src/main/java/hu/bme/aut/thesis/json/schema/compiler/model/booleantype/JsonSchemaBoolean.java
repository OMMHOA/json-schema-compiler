package hu.bme.aut.thesis.json.schema.compiler.model.booleantype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaBoolean extends JsonSchemaNode {
    public JsonSchemaBoolean() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("boolean");
    }
}
