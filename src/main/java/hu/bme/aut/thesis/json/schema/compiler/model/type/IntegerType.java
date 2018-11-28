package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.INTEGER;

public class IntegerType extends Type  {
    public IntegerType() {
        super(INTEGER);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isInt();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setIntegerValue(jsonNode.asInt());
    }

    @Override
    public boolean isInteger() {
        return true;
    }

    @Override
    public boolean canBeBoolean() {
        return true;
    }

    @Override
    public boolean canBeDouble() {
        return true;
    }

    @Override
    public boolean canBeString() {
        return true;
    }
}
