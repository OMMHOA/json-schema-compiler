package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.PartOfEquation;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.function.Function;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.function.SqrtFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class FuncVisitor extends EquationBaseVisitor<Function> {
    private final static Logger LOGGER = LoggerFactory.getLogger(FuncVisitor.class);

    @Override
    public Function visitFunc(EquationParser.FuncContext func) {
        Function function = func.funcname().accept(this);
        List<PartOfEquation> partParams = func.expression().stream()
                .map(expression -> expression.accept(new ExpressionVisitor()))
                .collect(Collectors.toList());
        function.setPartParams(partParams);
        return function;
    }

    @Override
    public Function visitFuncname(EquationParser.FuncnameContext funcname) {
        if (funcname.SQRT() != null) {
            LOGGER.debug("'sqrt' function recognized.");
            return new SqrtFunction();
        } // TODO: implement missing
        LOGGER.warn("No function name recognized!");
        return null;
    }
}
