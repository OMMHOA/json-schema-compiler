package hu.bme.aut.thesis.json.schema.compiler.model.equation.function;

import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

public class SqrtFunction extends Function {
    public SqrtFunction() {
        super(1);
    }

    @Override
    protected EquationValue calculate() {
        EquationValue param = params.get(0);
        if (param.canBeDouble()) {
            return getDoubleValue(Math.sqrt(param.asDouble()));
        }
        throw new RuntimeException("ERROR: Parameter can not be converted to double: " + param);
    }
}
