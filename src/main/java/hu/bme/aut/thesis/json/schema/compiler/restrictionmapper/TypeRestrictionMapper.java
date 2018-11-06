package hu.bme.aut.thesis.json.schema.compiler.restrictionmapper;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.restriction.*;

import java.util.Objects;

public class TypeRestrictionMapper extends RestrictionMapper{
    @Override
    protected String getKeyword() {
        return "type";
    }

    @Override
    protected Restriction getRestriction(JSONParser.ValueContext value) {
        if (Objects.isNull(value.STRING())) return null;
        String type = value.STRING().getText();
        switch (type) {
            case "array": new ArrayRestriction();
            case "boolean": new BooleanRestriction();
            case "integer": new IntegerRestriction();
            case "null": new NullRestriction();
            case "number": new NumberRestriction();
            case "object": new ObjectRestriction();
            case "string": new StringRestriction();
        }
        // TODO: log error msg
        return null;
    }
}
