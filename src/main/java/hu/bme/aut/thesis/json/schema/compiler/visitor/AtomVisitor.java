package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class AtomVisitor extends EquationBaseVisitor<EquationValue> {
    private static Logger LOGGER = LoggerFactory.getLogger(AtomVisitor.class);

    @Override
    public EquationValue visitSignedAtom(EquationParser.SignedAtomContext signedAtom) {
        if (signedAtom.atom() != null) {
            LOGGER.debug("Atom recognized.");
            return signedAtom.atom().accept(this);
        }
        // TODO: add missing
        LOGGER.warn("No SignedAtom recognized. Skipping...");
        return null;
    }

    @Override
    public EquationValue visitAtom(EquationParser.AtomContext atom) {
        EquationValue.Builder builder = new EquationValue.Builder();
        if (atom.array() != null) {
            LOGGER.debug("Array recognized.");
            builder.setListValue(getArrayValues(atom.array()));
        } else if (atom.BOOLEAN() != null) {
            LOGGER.debug("Boolean recognized.");
            builder.setBooleanValue(Boolean.parseBoolean(atom.BOOLEAN().getText()));
        } else if (atom.INT() != null) {
            LOGGER.debug("Integer recognized.");
            builder.setIntegerValue(Integer.parseInt(atom.INT().getText()));
        } else if (atom.NUMBER() != null) {
            LOGGER.debug("Double recognized.");
            builder.setDoubleValue(Double.parseDouble(atom.NUMBER().getText()));
        } else if (atom.STRING() != null) {
            LOGGER.debug("String recognized.");
            builder.setStringValue(unquote(atom.STRING().getText()));
        } else if (atom.THIS() != null) {
            LOGGER.debug("'this' recognized.");
            builder.setThisValue(true);
            // TODO: add missing
        } else {
            LOGGER.warn("No Atom recognized. Skipping...");
            return null;
        }
        return builder.build();
    }

    private List<EquationValue> getArrayValues(EquationParser.ArrayContext array) {
        return array.atom().stream()
                .map(atom -> atom.accept(this))
                .collect(Collectors.toList());
    }
}
