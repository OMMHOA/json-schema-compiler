package hu.bme.aut.thesis.json.schema.compiler.model.equation;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.operator.Operator;
import hu.bme.aut.thesis.json.schema.compiler.restriction.ExtraRestriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;

import java.util.List;
import java.util.Map;

public abstract class EquationRestriction extends Operator implements Restriction {
    @Override
    public boolean validate(JsonNode jsonNode) {
        EquationValue value = evaluate(jsonNode);
        if (value.getBooleanValue() != null) {
            return value.getBooleanValue();
        }
        return false;
    }

    protected EquationValue getValue(boolean booleanValue) {
        return new EquationValue.Builder().setBooleanValue(booleanValue).build();
    }

    @Override
    public EquationValue operate(List<EquationValue> left, List<EquationValue> right) {
        return getValue(false);
    }

    @Override
    public EquationValue operate(Boolean left, Boolean right) {
        return getValue(false);
    }

    @Override
    public EquationValue operate(Integer left, Integer right) {
        return getValue(false);
    }

    @Override
    public EquationValue operate(Double left, Double right) {
        return getValue(false);
    }

    @Override
    public EquationValue operate(String left, String right) {
        return getValue(false);
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) { }
}
