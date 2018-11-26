package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

public class LessThanRestriction extends EquationRestriction {
    @Override
    public EquationValue operate(Integer left, Integer right) {
        return getValue(left < right);
    }

    @Override
    public EquationValue operate(Double left, Double right) {
        return getValue(left < right);
    }
}
