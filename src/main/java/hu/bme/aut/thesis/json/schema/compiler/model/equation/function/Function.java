package hu.bme.aut.thesis.json.schema.compiler.model.equation.function;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.model.type.DoubleType;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Function implements PartOfEquation {
    private int maxNrOfParams;
    private List<PartOfEquation> partParams;
    List<EquationValue> params;

    Function(int maxNrOfParams) {
        this.maxNrOfParams = maxNrOfParams;
    }

    EquationValue getDoubleValue(Double d) {
        return new EquationValue.Builder()
                .setDoubleValue(d)
                .setType(new DoubleType())
                .setIsEvaluated(true)
                .build();
    }

    public void setPartParams(List<PartOfEquation> partParams) {
        if (partParams.size() > maxNrOfParams) {
            throw new RuntimeException("Too many parameters passed for " + this.getClass().getSimpleName());
        }
        this.partParams = partParams;
    }

    @Override
    public EquationValue evaluate(JsonNode jsonNode) {
        params = partParams.stream()
                .map(param -> param.evaluate(jsonNode))
                .collect(Collectors.toList());

        return calculate();
    }

    protected abstract EquationValue calculate();
}
