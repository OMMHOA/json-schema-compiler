package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;

public class TypeRestriction implements Restriction {
    private String value;

    public TypeRestriction(JSONParser.ValueContext value) {
        this.value = value.STRING().getText();
        switch (value.STRING().getText()) {
            case "\"array\"": return;
            case "\"boolean\"": return;
            case "\"integer\"": return;
            case "\"null\"": return;
            case "\"number\"": return;
            case "\"object\"": return;
            case "\"string\"": return;
        }
        throw new SchemaException("Value of key type should be" +
                " array/boolean/integer/null/number/object/string");
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        return false;
    }
}
