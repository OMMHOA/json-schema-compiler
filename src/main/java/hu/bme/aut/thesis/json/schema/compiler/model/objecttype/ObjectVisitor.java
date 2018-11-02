package hu.bme.aut.thesis.json.schema.compiler.model.objecttype;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class ObjectVisitor extends JSONBaseVisitor<JsonSchemaObject> {
    @Override
    public JsonSchemaObject visitObj(JSONParser.ObjContext ctx) {
        return new JsonSchemaObject();
    }
}
