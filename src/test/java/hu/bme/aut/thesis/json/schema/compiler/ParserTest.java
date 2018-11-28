package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest extends TestFixture {

    @Test
    public void schema1() {
        SchemaNode schemaNode = Parser.parse(schema1);
        assertTrue(schemaNode.validate(input1Node));
        assertFalse(schemaNode.validate(wrongInput11Node));
        assertFalse(schemaNode.validate(wrongInput12Node));
    }

    @Test
    public void schema2() {
        SchemaNode schemaNode = Parser.parse(schema2);
        assertTrue(schemaNode.validate(input2Node));
    }

    @Test
    public void schema3() {
        SchemaNode schemaNode = Parser.parse(schema3);
        assertTrue(schemaNode.validate(input3Node));
        assertFalse(schemaNode.validate(wrongInput31Node));
        assertFalse(schemaNode.validate(wrongInput32Node));
    }

    @Test
    public void schema4() {
        SchemaNode schemaNode = Parser.parse(schema4);
        assertTrue(schemaNode.validate(input4Node));
        assertFalse(schemaNode.validate(wrongInput41Node));
        assertFalse(schemaNode.validate(wrongInput42Node));
    }

    @Test
    public void schema5() {
        SchemaNode schemaNode = Parser.parse(schema5);
        assertTrue(schemaNode.validate(input5Node));
        assertFalse(schemaNode.validate(wrongInput51Node));
        assertFalse(schemaNode.validate(wrongInput52Node));
    }

    @Test
    public void schema7() {
        SchemaNode node = Parser.parse(schema7);
        assertTrue(node.validate(input7Node));
    }

    @Test
    public void equations() throws IOException {
        String[] equations = getResource("equations").split("\n");
        Restriction restriction;

        restriction = Parser.parseEquation(equations[0]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[1]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[2]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[3]);
        assertFalse(restriction.validate(null));

        restriction = Parser.parseEquation(equations[4]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[5]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[6]);
        assertTrue(restriction.validate(input1Node.get("age")));
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}