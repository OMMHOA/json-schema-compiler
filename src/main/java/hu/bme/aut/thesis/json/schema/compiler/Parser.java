package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.generated.EquationLexer;
import hu.bme.aut.thesis.json.schema.compiler.generated.EquationParser;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONLexer;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.ValueRestriction;
import hu.bme.aut.thesis.json.schema.compiler.visitor.EquationVisitor;
import hu.bme.aut.thesis.json.schema.compiler.visitor.JsonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Parser {
    public static SchemaNode parse(String sourceCode) {
        JSONLexer lexer = new JSONLexer(CharStreams.fromString(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);

        return parser.jsonwa().json().accept(new JsonVisitor());
    }

    public static ValueRestriction parseEquation(String equation) {
        EquationLexer lexer = new EquationLexer(CharStreams.fromString(equation));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EquationParser parser = new EquationParser(tokens);

        return parser.equation().accept(new EquationVisitor());
    }
}
