package hu.bme.aut.thesis.json.schema.compiler.visitor;

import com.fasterxml.jackson.core.JsonPointer;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.model.type.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class AtomVisitor extends EquationBaseVisitor<PartOfEquation> {
    private static Logger LOGGER = LoggerFactory.getLogger(AtomVisitor.class);

    @Override
    public PartOfEquation visitSignedAtom(EquationParser.SignedAtomContext signedAtom) {
        if (signedAtom.atom() != null) {
            LOGGER.debug("Atom recognized.");
            return signedAtom.atom().accept(this);
        }
        if (signedAtom.func() != null) {
            LOGGER.debug("Function recognized.");
            return signedAtom.func().accept(new FuncVisitor());
        }
        LOGGER.warn("No SignedAtom recognized. Skipping...");
        return null;
    }

    @Override
    public PartOfEquation visitAtom(EquationParser.AtomContext atom) {
        EquationValue.Builder builder = new EquationValue.Builder();
        if (atom.array() != null) {
            LOGGER.debug("Array recognized.");
            builder.setPreEvaluationListValue(getArrayValues(atom.array()))
                    .setType(new ListType());
        } else if (atom.BOOLEAN() != null) {
            LOGGER.debug("Boolean recognized.");
            builder.setBooleanValue(Boolean.parseBoolean(atom.BOOLEAN().getText()))
                    .setType(new BooleanType());
        } else if (atom.INT() != null) {
            LOGGER.debug("Integer recognized.");
            builder.setIntegerValue(Integer.parseInt(atom.INT().getText()))
                    .setType(new IntegerType());
        } else if (atom.NUMBER() != null) {
            LOGGER.debug("Double recognized.");
            builder.setDoubleValue(Double.parseDouble(atom.NUMBER().getText()))
                    .setType(new DoubleType());
        } else if (atom.STRING() != null) {
            LOGGER.debug("String recognized.");
            builder.setStringValue(unquote(atom.STRING().getText()))
                    .setType(new StringType());
        } else if (atom.THIS() != null) {
            LOGGER.debug("'this' recognized.");
            builder.setThisValue(true);
        } else if (atom.JSON_POINTER() != null) {
            LOGGER.debug("JsonPointer recognized.");
            builder.setPointerValue(JsonPointer.compile(unquote(atom.JSON_POINTER().getText())));
        } else if (atom.expression() != null) {
            LOGGER.debug("Expression in parentheses recognized.");
            return atom.expression().accept(new ExpressionVisitor());
        } else {
            LOGGER.warn("No Atom recognized. Skipping...");
            return null;
        }
        return builder.build();
    }

    private List<PartOfEquation> getArrayValues(EquationParser.ArrayContext array) {
        return array.expression().stream()
                .map(expression -> expression.accept(new ExpressionVisitor()))
                .collect(Collectors.toList());
    }
}
