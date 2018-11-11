package hu.bme.aut.thesis.json.schema.compiler.restriction;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueItemsRestrictionTest extends RestrictionTestFixture {
    UniqueItemsRestriction restriction = new UniqueItemsRestriction();

    @Test
    public void validate() {
        assertTrue(restriction.validate(input2Node.get("top_grades")));
        assertTrue(restriction.validate(input5Node));
        assertFalse(restriction.validate(wrongInput51Node));
    }
}