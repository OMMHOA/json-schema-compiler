package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumRestrictionTest extends RestrictionTestFixture {
    private static JsonNode node;
    private static final MinimumRestriction restriction = new MinimumRestriction();

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
        restriction.setValue(28d);
        assertFalse(restriction.validate(node));
        restriction.setExclusive(true);
        assertFalse(restriction.validate(node));
    }
}