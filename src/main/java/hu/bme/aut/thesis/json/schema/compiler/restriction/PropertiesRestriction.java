package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.visitor.SchemaObjectVisitor;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class PropertiesRestriction extends AbstractRestriction<Map<String, SchemaNode>> {
    @Override
    protected Map<String, SchemaNode> convertValue(JSONParser.ValueContext value) {
        return value.obj().pair().stream()
                .collect(Collectors.toMap(
                        pair -> unquote(pair.STRING().getText()),
                        pair -> pair.value().obj().accept(new SchemaObjectVisitor()),
                        (a, b) -> b));
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while (fields.hasNext()) {
            if (!isFieldValid(fields.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean isFieldValid(Map.Entry<String, JsonNode> field) {
        SchemaNode fieldNode = value.get(field.getKey());
        if (fieldNode != null) {
            return fieldNode.validate(field.getValue());
        }
        return true;
    }

    public PropertiesRestriction(JSONParser.ValueContext value) {
        super(value);
    }

    PropertiesRestriction() { }
}
