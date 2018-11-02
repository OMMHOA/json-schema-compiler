package hu.bme.aut.thesis.json.schema.compiler.model;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONLexer;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.jsontype.JsonSchemaJson;
import hu.bme.aut.thesis.json.schema.compiler.model.jsontype.JsonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Parser {
    public static JsonSchemaJson parse(String sourceCode) {
        JSONLexer lexer = new JSONLexer(CharStreams.fromString(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);

        return new JsonVisitor().visit(parser.json());
    }
}
