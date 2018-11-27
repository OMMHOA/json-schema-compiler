package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.ArrayList;
import java.util.List;

public class PowOperator extends Operator {
    @Override
    protected List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right) {
        int resultSize = Math.min(left.size(), right.size());
        List<EquationValue> result = new ArrayList<>(resultSize);
        for (int i = 0; i < resultSize; i++) {
            Operator operator = getPowOperator(left.get(i), right.get(i));
            result.add(operator.evaluate(jsonNode));
        }
        return result;
    }

    private Operator getPowOperator(EquationValue left, EquationValue right) {
        Operator operator = new PowOperator();
        operator.setLeft(left);
        operator.setRight(right);
        return operator;
    }

    @Override
    protected Boolean calculate(Boolean left, Boolean right) {
        throw new SchemaException("PowOperator does not support booleans.");
    }

    @Override
    protected Integer calculate(Integer left, Integer right) {
        return (int) Math.pow(left, right);
    }

    @Override
    protected Double calculate(Double left, Double right) {
        return Math.pow(left, right);
    }

    @Override
    protected String calculate(String left, String right) {
        throw new SchemaException("PowOperator does not support strings.");
    }
}
