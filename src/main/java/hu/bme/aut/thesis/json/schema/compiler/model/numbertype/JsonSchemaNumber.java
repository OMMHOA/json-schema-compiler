package hu.bme.aut.thesis.json.schema.compiler.model.numbertype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaNumber extends JsonSchemaNode {
    public JsonSchemaNumber() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("number");
    }
}
