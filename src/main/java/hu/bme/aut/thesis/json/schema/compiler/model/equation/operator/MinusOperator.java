package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.ArrayList;
import java.util.List;

public class MinusOperator extends Operator {
    @Override
    protected List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right) {
        List<EquationValue> result = new ArrayList<>(left);
        result.removeAll(right);
        return result;
    }

    @Override
    protected Boolean calculate(Boolean left, Boolean right) {
        throw new SchemaException("MinusOperator does not support booleans.");
    }

    @Override
    protected Integer calculate(Integer left, Integer right) {
        return left - right;
    }

    @Override
    protected Double calculate(Double left, Double right) {
        return left - right;
    }

    @Override
    protected String calculate(String left, String right) {
        return left.replaceAll(right, "");
    }
}
