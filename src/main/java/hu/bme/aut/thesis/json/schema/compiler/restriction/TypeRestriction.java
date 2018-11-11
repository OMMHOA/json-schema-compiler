package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.Type;

public class TypeRestriction extends ARestriction<Type> {
    public TypeRestriction(JSONParser.ValueContext value) {
        super(value);
        if (this.value == null) {
            throw new SchemaException("Invalid type: " + ValueConverter.toString(value));
        }
    }

    @Override
    protected Type convertValue(JSONParser.ValueContext value) {
        return Type.get(ValueConverter.toString(value));
    }


    @Override
    public boolean validate(JsonNode jsonNode) {
        return value.getChecker().apply(jsonNode);
    }

    TypeRestriction() { }
}
