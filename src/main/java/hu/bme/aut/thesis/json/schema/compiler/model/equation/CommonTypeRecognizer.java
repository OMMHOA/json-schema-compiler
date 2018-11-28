package hu.bme.aut.thesis.json.schema.compiler.model.equation;

import com.google.common.collect.ImmutableMap;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.operator.Operator;
import hu.bme.aut.thesis.json.schema.compiler.model.type.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Constants.*;

public class CommonTypeRecognizer {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonTypeRecognizer.class);
    static final Map<String, Type> TYPES;

    static {
        TYPES = ImmutableMap.<String, Type>builder()
                .put(ARRAY, new ListType())
                .put(BOOLEAN, new BooleanType())
                .put(INTEGER, new IntegerType())
                .put(NULL, new NullType())
                .put(NUMBER, new DoubleType())
                .put(OBJECT, new ObjectType())
                .put(STRING, new StringType())
                .build();
    }

    public static EquationValue operate(EquationValue left, EquationValue right, Operator operator) {
        if (left.sameType(right)) {
            LOGGER.debug("Left and right part of operation '" + operator.getClass().getName() + "' are of the same type: " + left.getType());
            return operateSameType(left, right, operator);
        }
        LOGGER.debug("Left and right part of operation '" + operator.getClass().getName() + "' are of different type. Left: " + left.getType()
                + " Right: " + right.getType());
        return operateDifferentType(left, right, operator);
    }

    private static EquationValue operateSameType(EquationValue left, EquationValue right, Operator operator) {
        if (left.isList()) {
            return operator.operate(left.getListValue(), right.getListValue());
        }
        if (left.isBoolean()) {
            return operator.operate(left.getBooleanValue(), right.getBooleanValue());
        }
        if (left.isInteger()) {
            return operator.operate(left.getIntegerValue(), right.getIntegerValue());
        }
        if (left.isDouble()) {
            return operator.operate(left.getDoubleValue(), right.getDoubleValue());
        }
        if (left.isString()) {
            return operator.operate(left.getStringValue(), right.getStringValue());
        }
        return new EquationValue.Builder().setNullValue(true).build();
    }

    private static EquationValue operateDifferentType(EquationValue left, EquationValue right, Operator operator) {
        return null;
    }
}
