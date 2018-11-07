package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthRestrictionTest extends RestrictionTestFixture {
    private static JsonNode node;
    private static MaxLengthRestriction restriction = new MaxLengthRestriction();

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
        restriction.setValue(3);
        assertFalse(restriction.validate(node));
    }
}