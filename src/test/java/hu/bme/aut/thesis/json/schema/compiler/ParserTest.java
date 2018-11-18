package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Test;

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

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}