package hu.bme.aut.thesis.json.schema.compiler.model.equation.operator;

import com.fasterxml.jackson.databind.JsonNode;
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

    public abstract EquationValue operate(List<EquationValue> left, List<EquationValue> right);
    public abstract EquationValue operate(Boolean left, Boolean right);
    public abstract EquationValue operate(Integer left, Integer right);
    public abstract EquationValue operate(Double left, Double right);
    public abstract EquationValue operate(String left, String right);
}
