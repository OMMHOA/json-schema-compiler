package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.visitor.SchemaObjectVisitor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemsRestriction implements Restriction {
    private SchemaNode schemaForAll;
    private List<SchemaNode> schemas;

    public ItemsRestriction(JSONParser.ValueContext value) {
        if (value.obj() != null) {
            schemaForAll = value.obj().accept(new SchemaObjectVisitor());
        } else {
            schemas = value.array().value().stream()
                    .map(val -> val.obj().accept(new SchemaObjectVisitor()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        if (schemaForAll != null) {
            return isValidWithSingleSchema(jsonNode);
        } else {
            return isValidWithSchemas(jsonNode);
        }
    }

    private boolean isValidWithSingleSchema(JsonNode jsonNode) {
        for (int i = 0; i < jsonNode.size(); i++) {
            if (!schemaForAll.validate(jsonNode.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidWithSchemas(JsonNode jsonNode) {
        for (int i = 0; i < jsonNode.size() && i < schemas.size(); i++) {
            if (!schemas.get(i).validate(jsonNode.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Set<ExtraRestriction> extraRestrictions) { }

    ItemsRestriction() { }

    void setSchemaForAll(SchemaNode schemaForAll) {
        this.schemaForAll = schemaForAll;
    }

    void setSchemas(List<SchemaNode> schemas) {
        this.schemas = schemas;
    }
}
