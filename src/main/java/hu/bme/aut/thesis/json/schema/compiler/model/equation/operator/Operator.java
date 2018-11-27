package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.CommonTypeRecognizer;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;

import java.util.List;

public abstract class Operator implements PartOfEquation {
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
        return new EquationValue.Builder().setListValue(calculate(left, right)).build();
    }
    public EquationValue operate(Boolean left, Boolean right){
        return new EquationValue.Builder().setBooleanValue(calculate(left, right)).build();
    }
    public EquationValue operate(Integer left, Integer right){
        return new EquationValue.Builder().setIntegerValue(calculate(left, right)).build();
    }
    public EquationValue operate(Double left, Double right){
        return new EquationValue.Builder().setDoubleValue(calculate(left, right)).build();
    }
    public EquationValue operate(String left, String right){
        return new EquationValue.Builder().setStringValue(calculate(left, right)).build();
    }

    protected abstract List<EquationValue> calculate(List<EquationValue> left, List<EquationValue> right);
    protected abstract Boolean calculate(Boolean left, Boolean right);
    protected abstract Integer calculate(Integer left, Integer right);
    protected abstract Double calculate(Double left, Double right);
    protected abstract String calculate(String left, String right);
}
