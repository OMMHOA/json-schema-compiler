package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOfRestrictionTest extends TestFixture {
    MultipleOfRestriction restriction = new MultipleOfRestriction();

    @Test
    public void validate() {
        restriction.setValue(3d);
        assertTrue(restriction.validate(input5Node));
        restriction.setValue(4d);
        assertFalse(restriction.validate(input5Node));
    }
}