package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.BOOLEAN;

public class BooleanType extends Type {
    public BooleanType() {
        super(BOOLEAN);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isBoolean();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setBooleanValue(jsonNode.asBoolean());
    }

    @Override
    public boolean isBoolean() {
        return true;
    }
}
