package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.NULL;

public class NullType extends Type  {
    public NullType() {
        super(NULL);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isNull();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setNullValue();
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
