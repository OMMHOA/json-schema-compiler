package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOfRestrictionTest extends TestFixture {
    MultipleOfRestriction restriction = new MultipleOfRestriction();

    @Test
    public void validate() {
        restriction.setValue(3d);
        for (int i = 0; i < input5Node.size(); i++) {
            assertTrue(restriction.validate(input5Node.get(i)));
        }
        restriction.setValue(4d);
        for (int i = 0; i < input5Node.size(); i++) {
            assertFalse(restriction.validate(input5Node.get(i)));
        }
    }
}