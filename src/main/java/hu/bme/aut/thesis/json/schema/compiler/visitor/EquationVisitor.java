package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquationVisitor extends EquationBaseVisitor<Restriction> {
    private static Logger LOGGER = LoggerFactory.getLogger(EquationVisitor.class);

    @Override
    public Restriction visitEquation(EquationParser.EquationContext equation) {
        LOGGER.debug("Getting relop.");
        EquationRestriction restriction = equation.relop().accept(new RelopVisitor());
        LOGGER.debug("Setting left.");
        restriction.setLeft(equation.expression(0).accept(new ExpressionVisitor()));
        LOGGER.debug("Setting right.");
        restriction.setRight(equation.expression(1).accept(new ExpressionVisitor()));
        return restriction;
    }
}
