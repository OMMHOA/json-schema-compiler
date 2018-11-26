package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;

public class ExpressionVisitor extends EquationBaseVisitor<PartOfEquation> {
    @Override
    public PartOfEquation visitExpression(EquationParser.ExpressionContext expression) {
        return null;
    }
}
