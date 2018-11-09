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
    public void schema1() throws IOException {
        SchemaNode schemaNode = Parser.parse(getResource("schema1.json"));
        assertTrue(schemaNode.validate(input1Node));
        assertFalse(schemaNode.validate(wrongInput1Node));
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}