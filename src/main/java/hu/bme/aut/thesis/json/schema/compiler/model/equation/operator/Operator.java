package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.CommonTypeRecognizer;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.model.type.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class Operator implements PartOfEquation {
    private static Logger LOGGER = LoggerFactory.getLogger(Operator.class);
    private PartOfEquation left;
    private PartOfEquation right;
    protected JsonNode jsonNode;

    @Override
    public EquationValue evaluate(JsonNode jsonNode) {
        this.jsonNode = jsonNode;
        return CommonTypeRecognizer.operate(
                left.evaluate(jsonNode),
                right.evaluate(jsonNode),
                this
        );
    }

    public PartOfEquation getLeft() {
        return left;
    }

    public void setLeft(PartOfEquation left) {
        this.left = left;
    }

    public PartOfEquation getRight() {
        return right;
    }

    public void setRight(PartOfEquation right) {
        this.right = right;
    }

    public EquationValue operate(List<EquationValue> left, List<EquationValue> right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return new EquationValue.Builder()
                .setListValue(calculate(left, right))
                .setType(new ListType())
                .setIsEvaluated(true)
                .build();
    }
    public EquationValue operate(Boolean left, Boolean right){
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return new EquationValue.Builder()
                .setBooleanValue(calculate(left, right))
                .setType(new BooleanType())
                .setIsEvaluated(true)
                .build();
    }
    public EquationValue operate(Integer left, Integer right){
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return new EquationValue.Builder()
                .setIntegerValue(calculate(left, right))
                .setType(new IntegerType())
                .setIsEvaluated(true)
                .build();
    }
    public EquationValue operate(Double left, Double right){
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return new EquationValue.Builder()
                .setDoubleValue(calculate(left, right))
                .setType(new DoubleType())
                .setIsEvaluated(true)
                .build();
    }
    public EquationValue operate(String left, String right){
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return new EquationValue.Builder()
                .setStringValue(calculate(left, right))
                .setType(new StringType())
                .setIsEvaluated(true)
                .build();
    }

    protected abstract List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right);
    protected abstract Boolean calculate(Boolean left, Boolean right);
    protected abstract Integer calculate(Integer left, Integer right);
    protected abstract Double calculate(Double left, Double right);
    protected abstract String calculate(String left, String right);
}
