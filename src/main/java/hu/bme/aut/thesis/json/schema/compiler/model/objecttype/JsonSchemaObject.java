package hu.bme.aut.thesis.json.schema.compiler.model.objecttype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Arrays;

public class JsonSchemaObject extends JsonSchemaNode {
    public JsonSchemaObject() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Arrays.asList("object");
    }
}
