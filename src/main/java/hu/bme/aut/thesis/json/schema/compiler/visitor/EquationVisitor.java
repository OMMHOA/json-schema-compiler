package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquationVisitor extends EquationBaseVisitor<Restriction> {
    private static Logger LOGGER = LoggerFactory.getLogger(EquationVisitor.class);
    private EquationParser.EquationContext equation;

    @Override
    public Restriction visitEquation(EquationParser.EquationContext equation) {
        this.equation = equation;
        LOGGER.debug("Getting relop.");
        EquationRestriction restriction = equation.relop().accept(new RelopVisitor());
        if (restriction == null) {
            LOGGER.warn("Failed to get restriction for relop. Skipping...");
            return null;
        }
        LOGGER.debug("Setting left part of equation.");
        PartOfEquation part = getPart(0);
        if (part == null) {
            LOGGER.warn("Failed to set left. Skipping...");
            return null;
        }
        restriction.setLeft(part);
        LOGGER.debug("Setting right part of equation.");
        part = getPart(1);
        if (part == null) {
            LOGGER.warn("Failed to set right. Skipping...");
            return null;
        }
        restriction.setRight(part);
        return restriction;
    }

    private PartOfEquation getPart(int i) {
        return equation.expression(i).accept(new ExpressionVisitor());
    }
}
