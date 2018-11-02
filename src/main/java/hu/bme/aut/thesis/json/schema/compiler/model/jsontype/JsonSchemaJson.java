package hu.bme.aut.thesis.json.schema.compiler.model.jsontype;

import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaNode;

import java.util.Collections;

public class JsonSchemaJson extends JsonSchemaNode {
    public JsonSchemaJson() {
        super();
    }

    @Override
    protected void initAllowedRestrictions() {
        allowedRestrictions = Collections.emptyList();
    }
}
