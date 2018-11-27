package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static hu.bme.aut.thesis.json.schema.compiler.visitor.Utils.warnValue;

public class JsonVisitor extends JSONBaseVisitor<SchemaNode> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonVisitor.class);

    @Override
    public SchemaNode visitJson(JSONParser.JsonContext ctx) {
        JSONParser.ValueContext value = ctx.value();
        JSONParser.ObjContext obj = value.obj();
        if (Objects.nonNull(obj)) {
            return obj.accept(new ObjectVisitor());
        } else {
            LOGGER.warn("Top level element of json schema is not an object!");
            warnValue(value, LOGGER);
            throw new SchemaException("Top level element of json schema should be an object!");
        }
    }
}
