package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.ArrayList;
import java.util.List;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.ARRAY;

public class ListType extends Type  {
    public ListType() {
        super(ARRAY);
    }

    @Override
    public boolean isType(JsonNode jsonNode) {
        return jsonNode.isArray();
    }

    @Override
    public void setValue(JsonNode jsonNode, EquationValue equationValue) {
        int size = jsonNode.size();
        List<EquationValue> listValue = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            EquationValue memberValue = new EquationValue.Builder().setThisValue(true).build();
            listValue.add(memberValue.evaluate(jsonNode.get(i)));
        }
        equationValue.setListValue(listValue);
    }

    @Override
    public boolean isList() {
        return true;
    }
}
