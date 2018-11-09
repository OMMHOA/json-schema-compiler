package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.RestrictionTestFixture;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class E2ETest extends RestrictionTestFixture {
    @Test
    public void schema1() throws IOException {
        SchemaNode schemaNode = Parser.parse(getResource("schema1.json"));
        assertTrue(schemaNode.validate(input1Node));
        assertFalse(schemaNode.validate(wrongInput1Node));
    }
}
