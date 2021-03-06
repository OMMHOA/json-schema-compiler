package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueItemsRestrictionTest extends TestFixture {
    UniqueItemsRestriction restriction = new UniqueItemsRestriction();

    @Test
    public void validate() {
        restriction.setValue(true);
        assertTrue(restriction.validate(input2Node.get("top_grades")));
        assertTrue(restriction.validate(input5Node));
        assertFalse(restriction.validate(wrongInput51Node));
    }
}