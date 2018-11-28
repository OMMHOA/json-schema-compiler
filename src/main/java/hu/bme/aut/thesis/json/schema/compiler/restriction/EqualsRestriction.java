package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EqualsRestriction extends EquationRestriction {
    private static final Logger LOGGER = LoggerFactory.getLogger(EquationRestriction.class);

    @Override
    public EquationValue operate(List<EquationValue> left, List<EquationValue> right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Boolean left, Boolean right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Integer left, Integer right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(Double left, Double right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return getValue(left.equals(right));
    }

    @Override
    public EquationValue operate(String left, String right) {
        LOGGER.debug(this.getClass().getSimpleName() + ": Left: " + left + " Right: " + right);
        return getValue(left.equals(right));
    }
}
