package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumRestrictionTest extends TestFixture {
    private static JsonNode node;
    private static final MaximumRestriction restriction = new MaximumRestriction();

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        node = input1Node.get("age");
    }

    @Test
    public void validate() {
        restriction.setValue(27d);
        assertTrue(restriction.validate(node));
        restriction.setValue(26d);
        assertFalse(restriction.validate(node));
        restriction.setExclusive(true);
        assertFalse(restriction.validate(node));
    }
}