package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.RestrictionTestFixture;
import hu.bme.aut.thesis.json.schema.compiler.restriction.TypeRestriction;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest extends RestrictionTestFixture {

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
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}