package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.visitor.ObjectVisitor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.getBool;

public class ItemsRestriction implements Restriction {
    private SchemaNode schemaForAll;
    private List<SchemaNode> schemas;
    private boolean additionalItems = true;

    public ItemsRestriction(JSONParser.ValueContext value) {
        if (value.obj() != null) {
            schemaForAll = value.obj().accept(new ObjectVisitor());
        } else {
            schemas = value.array().value().stream()
                    .map(val -> val.obj().accept(new ObjectVisitor()))
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
        if (!additionalItems && jsonNode.size() > schemas.size()) return false;
        for (int i = 0; i < jsonNode.size() && i < schemas.size(); i++) {
            if (!schemas.get(i).validate(jsonNode.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) {
        Boolean val;
        if ((val = getBool(extraRestrictions.get(ExtraRestriction.additionalItems))) != null) {
            additionalItems = val;
        }
    }

    ItemsRestriction() { }

    void setSchemaForAll(SchemaNode schemaForAll) {
        this.schemaForAll = schemaForAll;
    }

    void setSchemas(List<SchemaNode> schemas) {
        this.schemas = schemas;
    }
}
