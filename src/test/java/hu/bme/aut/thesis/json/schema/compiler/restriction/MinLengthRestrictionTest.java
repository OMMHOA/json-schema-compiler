package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinLengthRestrictionTest extends TestFixture {
    private static JsonNode node;
    private static MinLengthRestriction restriction = new MinLengthRestriction();

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        node = input1Node.get("first_name");
    }

    @Test
    public void validate() {
        restriction.setValue(4);
        assertTrue(restriction.validate(node));
        restriction.setValue(5);
        assertFalse(restriction.validate(node));
    }
}