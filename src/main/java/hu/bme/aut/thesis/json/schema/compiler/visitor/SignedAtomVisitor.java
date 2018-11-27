package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

public class SignedAtomVisitor extends EquationBaseVisitor<EquationValue> {
    @Override
    public EquationValue visitSignedAtom(EquationParser.SignedAtomContext ctx) {
        return super.visitSignedAtom(ctx);
    }
}
