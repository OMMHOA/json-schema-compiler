package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.operator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperatorVisitor extends EquationBaseVisitor<Operator> {
    private static Logger LOGGER = LoggerFactory.getLogger(OperatorVisitor.class);

    @Override
    public Operator visitPlusOrMinus(EquationParser.PlusOrMinusContext plusOrMinus) {
        if (plusOrMinus.PLUS() != null) {
            LOGGER.debug("PlusOperator recognized.");
            return new PlusOperator();
        }
        if (plusOrMinus.MINUS() != null) {
            LOGGER.debug("MinusOperator recognized.");
            return new MinusOperator();
        }
        LOGGER.warn("Plus or Minus Operator not recognized!");
        return null;
    }

    @Override
    public Operator visitTimesOrDiv(EquationParser.TimesOrDivContext timesOrDiv) {
        if (timesOrDiv.TIMES() != null) {
            LOGGER.debug("TimesOperator recognized.");
            return new TimesOperator();
        }
        if (timesOrDiv.DIV() != null) {
            LOGGER.debug("DivOperator recognized");
            return new DivOperator();
        }
        LOGGER.warn("Times or Div Operator not recognized!");
        return null;
    }
}
