package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.ArrayList;
import java.util.List;

public class TimesOperator extends Operator {
    @Override
    protected List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right) {
        int resultSize = Math.min(left.size(), right.size());
        List<EquationValue> result = new ArrayList<>(resultSize);
        for (int i = 0; i < resultSize; i++) {
            Operator operator = getTimesOperator(left.get(i), right.get(i));
            result.add(operator.evaluate(jsonNode));
        }
        return result;
    }

    private Operator getTimesOperator(EquationValue left, EquationValue right) {
        Operator operator = new TimesOperator();
        operator.setLeft(left);
        operator.setRight(right);
        return operator;
    }

    @Override
    protected Boolean calculate(Boolean left, Boolean right) {
        return left && right;
    }

    @Override
    protected Integer calculate(Integer left, Integer right) {
        return left * right;
    }

    @Override
    protected Double calculate(Double left, Double right) {
        return left * right;
    }

    @Override
    protected String calculate(String left, String right) {
        throw new SchemaException("TimesOperator does not support strings.");
    }
}
