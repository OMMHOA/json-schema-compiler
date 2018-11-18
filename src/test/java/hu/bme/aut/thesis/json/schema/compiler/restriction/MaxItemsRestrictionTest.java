package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxItemsRestrictionTest extends TestFixture {
    MaxItemsRestriction restriction = new MaxItemsRestriction();

    @Test
    public void validate() {
        JsonNode anArray = input3Node.get("2017_goal_king");
        restriction.setValue(2);
        assertTrue(restriction.validate(anArray));
        restriction.setValue(1);
        assertFalse(restriction.validate(anArray));
    }
}