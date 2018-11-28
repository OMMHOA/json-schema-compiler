package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.NUMBER;

public class DoubleType extends Type {
    public DoubleType() {
        super(NUMBER);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isDouble();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setDoubleValue(jsonNode.asDouble());
    }

    @Override
    public boolean isDouble() {
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

    @Override
    public boolean canBeString() {
        return true;
    }
}
