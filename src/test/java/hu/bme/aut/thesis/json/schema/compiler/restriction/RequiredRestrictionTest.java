package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.google.common.collect.Sets;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Test;

import static org.junit.Assert.*;


public class RequiredRestrictionTest extends TestFixture {
    RequiredRestriction restriction = new RequiredRestriction();

    @Test
    public void validate() {
        restriction.setValue(Sets.newHashSet("first_name", "last_name", "age"));
        assertTrue(restriction.validate(input1Node));
        restriction.setValue(Sets.newHashSet("first_name", "last_name", "age", "date_of_birth"));
        assertFalse(restriction.validate(input1Node));
    }
}