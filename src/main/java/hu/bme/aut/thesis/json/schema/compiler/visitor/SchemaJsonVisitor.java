package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class SchemaJsonVisitor extends JSONBaseVisitor<SchemaNode> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchemaJsonVisitor.class);

    @Override
    public SchemaNode visitJson(JSONParser.JsonContext ctx) {
        JSONParser.ValueContext value = ctx.value();
        JSONParser.ObjContext obj = value.obj();
        if (Objects.nonNull(obj)) {
            return obj.accept(new SchemaObjectVisitor());
        } else {
            LOGGER.debug("ERROR: Top level element of json schema is not an object.");
            LOGGER.debug("Is array: " + Objects.nonNull(value.array()));
            LOGGER.debug("Is INT: " + Objects.nonNull(value.INT()));
            LOGGER.debug("Is NUMBER: " + Objects.nonNull(value.NUMBER()));
            LOGGER.debug("Is STRING: " + Objects.nonNull(value.STRING()));
            LOGGER.debug("Is BOOLEAN: " + Objects.nonNull(value.BOOLEAN()));
            LOGGER.debug("Is NULL: " + Objects.nonNull(value.NULL()));
            throw new SchemaException("Top level element of json schema should be an object!");
        }
    }
}
