package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationRestriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.EqualsRestriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.LessThanRestriction;
import hu.bme.aut.thesis.json.schema.compiler.restriction.MoreThanRestriction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RelopVisitor extends EquationBaseVisitor<EquationRestriction> {
    private static Logger LOGGER = LoggerFactory.getLogger(RelopVisitor.class);

    @Override
    public EquationRestriction visitRelop(EquationParser.RelopContext relop) {
        if (relop.EQ() != null) {
            LOGGER.debug("Recognized equals relop.");
            return new EqualsRestriction();
        }
        if (relop.LT() != null) {
            LOGGER.debug("Recognized less than relop.");
            return new LessThanRestriction();
        }
        if (relop.GT() != null) {
            LOGGER.debug("Recognized more than relop.");
            return new MoreThanRestriction();
        }
        LOGGER.warn("No relop recognized.");
        return null;
    }
}
