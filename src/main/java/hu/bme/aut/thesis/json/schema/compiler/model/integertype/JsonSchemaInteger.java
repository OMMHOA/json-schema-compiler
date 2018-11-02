package hu.bme.aut.thesis.json.schema.compiler.model.integertype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaInteger extends JsonSchemaNode {
    public JsonSchemaInteger() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("integer");
    }
}
