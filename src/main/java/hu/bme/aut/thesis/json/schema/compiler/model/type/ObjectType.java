package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.OBJECT;

public class ObjectType extends Type  {
    public ObjectType() {
        super(OBJECT);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isObject();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        equationValue.setObjectValue(jsonNode);
    }

    @Override
    public boolean isObject() {
        return true;
    }
}
