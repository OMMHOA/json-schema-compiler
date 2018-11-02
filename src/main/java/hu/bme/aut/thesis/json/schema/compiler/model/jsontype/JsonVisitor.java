package hu.bme.aut.thesis.json.schema.compiler.model.jsontype;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.objecttype.ObjectVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class JsonVisitor extends JSONBaseVisitor<JsonSchemaJson> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonVisitor.class);

    @Override
    public JsonSchemaJson visitJson(JSONParser.JsonContext ctx) {
        JSONParser.ValueContext value = ctx.value();
        JsonSchemaJson json = new JsonSchemaJson();
        JSONParser.ObjContext obj = value.obj();
        if (Objects.nonNull(obj)) {
            json.addChild(obj.accept(new ObjectVisitor()));
            return json;
        } else {
            LOGGER.debug("ERROR: Top level element of json schema is not an object.");
            LOGGER.debug("Is array: " + Objects.nonNull(value.array()));
            LOGGER.debug("Is INT: " + Objects.nonNull(value.INT()));
            LOGGER.debug("Is NUMBER: " + Objects.nonNull(value.NUMBER()));
            LOGGER.debug("Is STRING: " + Objects.nonNull(value.STRING()));
            LOGGER.debug("Is BOOLEAN: " + Objects.nonNull(value.BOOLEAN()));
            LOGGER.debug("Is NULL: " + Objects.nonNull(value.NULL()));
            throw new JsonSchemaException("Top level element of json schema should be an object!");
        }
//        else if (Objects.nonNull(value.array())) {
//            json.addChild(new JsonSchemaArray());
//        } else if (Objects.nonNull(value.INT())) {
//            json.addChild(new JsonSchemaInteger());
//        } else if (Objects.nonNull(value.NUMBER())) {
//            json.addChild(new JsonSchemaNumber());
//        } else if (Objects.nonNull(value.STRING())) {
//            json.addChild(new JsonSchemaString());
//        } else if (Objects.nonNull(value.BOOLEAN())) {
//            json.addChild(new JsonSchemaBoolean());
//        } else if (Objects.nonNull(value.NULL())) {
//            json.addChild(new JsonSchemaNull());
//        }
    }
}
