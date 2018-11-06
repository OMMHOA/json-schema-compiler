package hu.bme.aut.thesis.json.schema.compiler.restrictionmapper;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.restriction.*;

public class TypeRestrictionMapper extends RestrictionMapper{
    @Override
    protected String getKeyword() {
        return "type";
    }

    @Override
    protected Restriction getRestriction(JSONParser.ValueContext value) {
        if (value.STRING() == null) return null;
        switch (value.STRING().getText()) {
            case "\"array\"": return new ArrayRestriction();
            case "\"boolean\"": return new BooleanRestriction();
            case "\"integer\"": return new IntegerRestriction();
            case "\"null\"": return new NullRestriction();
            case "\"number\"": return new NumberRestriction();
            case "\"object\"": return new ObjectRestriction();
            case "\"string\"": return new StringRestriction();
        }
        throw new SchemaException("Value of key " + getKeywordWithQuote() + " should be" +
                " array/boolean/integer/null/number/object/string");
    }
}
