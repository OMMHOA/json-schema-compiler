package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.restriction.ValueRestriction;

public class EquationVisitor extends EquationBaseVisitor<ValueRestriction> {
    @Override
    public ValueRestriction visitEquation(EquationParser.EquationContext equation) {
        return new ValueRestriction();
    }
}
