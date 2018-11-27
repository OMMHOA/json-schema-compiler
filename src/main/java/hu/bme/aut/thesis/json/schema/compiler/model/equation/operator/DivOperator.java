package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.ArrayList;
import java.util.List;

public class DivOperator extends Operator {
    @Override
    protected List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right) {
        int resultSize = Math.min(left.size(), right.size());
        List<EquationValue> result = new ArrayList<>(resultSize);
        for (int i = 0; i < resultSize; i++) {
            Operator operator = getDivOperator(left.get(i), right.get(i));
            result.add(operator.evaluate(jsonNode));
        }
        return result;
    }

    private Operator getDivOperator(EquationValue left, EquationValue right) {
        Operator operator = new DivOperator();
        operator.setLeft(left);
        operator.setRight(right);
        return operator;
    }

    @Override
    protected Boolean calculate(Boolean left, Boolean right) {
        throw new SchemaException("DivOperator does not support booleans.");
    }

    @Override
    protected Integer calculate(Integer left, Integer right) {
        return left / right;
    }

    @Override
    protected Double calculate(Double left, Double right) {
        return left / right;
    }

    @Override
    protected String calculate(String left, String right) {
        throw new SchemaException("DivOperator does not support strings.");
    }
}
