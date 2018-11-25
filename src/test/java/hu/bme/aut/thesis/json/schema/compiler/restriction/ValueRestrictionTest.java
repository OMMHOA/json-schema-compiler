package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.Parser;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValueRestrictionTest extends TestFixture {
    ValueRestriction restriction = new ValueRestriction();

    @Test
    public void validate() {
        SchemaNode node = Parser.parse(schema7);
        assertTrue(node.validate(input7Node));
    }
}