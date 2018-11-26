package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.List;

public class EqualsRestriction extends EquationRestriction {
    @Override
    public EquationValue operate(List<EquationValue> left, List<EquationValue> right) {
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Boolean left, Boolean right) {
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Integer left, Integer right) {
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Double left, Double right) {
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(String left, String right) {
        return getValue(left.equals(right));
    }
}
