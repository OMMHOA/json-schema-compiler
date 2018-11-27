package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.operator.Operator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: consider using reflection
public class ExpressionVisitor extends EquationBaseVisitor<PartOfEquation> {
    private static Logger LOGGER = LoggerFactory.getLogger(ExpressionVisitor.class);

    @Override
    public PartOfEquation visitExpression(EquationParser.ExpressionContext expression) {
        if (expression.plusOrMinusExpression() != null) {
            LOGGER.debug("plusOrMinusExpression recognized.");
            return expression.plusOrMinusExpression().accept(this);
        }
        if (expression.multiplyingExpression() != null) {
            LOGGER.debug("Single multiplyingExpression recognized.");
            return expression.multiplyingExpression().accept(this);
        }
        LOGGER.warn("No expression recognized");
        return null;
    }

    @Override
    public PartOfEquation visitPlusOrMinusExpression(EquationParser.PlusOrMinusExpressionContext expression) {
        LOGGER.debug("Getting plus or minus operator.");
        Operator operator = expression.plusOrMinus().accept(new OperatorVisitor());
        if (operator == null) {
            LOGGER.warn("Failed to get plus or minus operator! Skipping...");
            return null;
        }
        PartOfEquation part = expression.multiplyingExpression(0).accept(this);
        if (part == null) {
            LOGGER.warn("Failed to set left. Skipping...");
            return null;
        }
        operator.setLeft(part);
        part = expression.plusOrMinusExpression() != null ? expression.plusOrMinusExpression().accept(this) :
                expression.multiplyingExpression(1).accept(this);
        if (part == null) {
            LOGGER.warn("Failed to set right. Skipping...");
            return null;
        }
        operator.setRight(part);
        return operator;
    }

    @Override
    public PartOfEquation visitMultiplyingExpression(EquationParser.MultiplyingExpressionContext expression) {
        if (expression.timesOrDivExpression() != null) {
            LOGGER.debug("timesOrDivExpression recognized.");
            return expression.timesOrDivExpression().accept(this);
        }
        if (expression.poweredExpression() != null) {
            LOGGER.debug("Single poweredExpression recognized.");
            return expression.poweredExpression().accept(this);
        }
        LOGGER.warn("No expression recognized. Skipping...");
        return null;
    }

    @Override
    public PartOfEquation visitTimesOrDivExpression(EquationParser.TimesOrDivExpressionContext expression) {
        LOGGER.debug("Getting times or div operator.");
        Operator operator = expression.timesOrDiv().accept(new OperatorVisitor());
        if (operator == null) {
            LOGGER.warn("Failed to get times or div operator! Skipping...");
            return null;
        }
        PartOfEquation part = expression.poweredExpression(0).accept(this);
        if (part == null) {
            LOGGER.warn("Failed to set left. Skipping...");
            return null;
        }
        operator.setLeft(part);
        part = expression.timesOrDivExpression() != null ? expression.timesOrDivExpression().accept(this) :
                expression.poweredExpression(1).accept(this);
        if (part == null) {
            LOGGER.warn("Failed to set right. Skipping...");
            return null;
        }
        operator.setRight(part);
        return operator;
    }

    @Override
    public PartOfEquation visitPoweredExpression(EquationParser.PoweredExpressionContext expression) {
        if (expression.powExpression() != null) {
            LOGGER.debug("powExpression recognized.");
            return expression.powExpression().accept(this);
        }
        if (expression.signedAtom() != null) {
            LOGGER.debug("Single signedAtom recognized.");
            return expression.signedAtom().accept(new SignedAtomVisitor());
        }
        LOGGER.warn("No expression recognized. Skipping...");
        return null;
    }
}
