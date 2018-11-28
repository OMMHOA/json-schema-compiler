package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.STRING;

public class StringType extends Type {
    public StringType() {
        super(STRING);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isTextual();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setStringValue(jsonNode.asText());
    }

    @Override
    public boolean isString() {
        return true;
    }

    @Override
    public boolean canBeList() {
        return true;
    }

    @Override
    public boolean canBeBoolean() {
        return true;
    }

    @Override
    public boolean canBeInteger() {
        return true;
    }

    @Override
    public boolean canBeDouble() {
        return true;
    }
}
