package hu.bme.aut.thesis.json.schema.compiler.restriction;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternRestrictionTest extends RestrictionTestFixture {
    private PatternRestriction restriction = new PatternRestriction();

    @Test
    public void validate() {
        restriction.setValue("^[a-zA-Z' -]*$");
        assertTrue(restriction.validate(input1Node.get("first_name")));
        assertTrue(restriction.validate(input1Node.get("age")));
        assertFalse(restriction.validate(input2Node.get("email")));
        assertFalse(restriction.validate(wrongInput11Node.get("first_name")));
    }
}