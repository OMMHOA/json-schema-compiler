package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeRestrictionTest extends RestrictionTestFixture {
    private TypeRestriction restriction = new TypeRestriction();

    @Test
    public void validate() {
        JsonNode anArray = input2Node.get("top_grades");
        JsonNode aBoolean = input2Node.get("isPassing");
        JsonNode anInteger = input1Node.get("age");
        JsonNode aNull = input2Node.get("evaluation");
        JsonNode aNumber = input2Node.get("average");
        JsonNode anObject = schema1Node.get("properties");
        JsonNode aString = input1Node.get("first_name");

        restriction.setValue(Type.ARRAY_TYPE);
        assertTrue(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(anInteger));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(anObject));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.BOOLEAN_TYPE);
        assertTrue(restriction.validate(aBoolean));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(anInteger));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(anObject));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.INTEGER_TYPE);
        assertTrue(restriction.validate(anInteger));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(anObject));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.NULL_TYPE);
        assertTrue(restriction.validate(aNull));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(anInteger));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(anObject));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.NUMBER_TYPE);
        assertTrue(restriction.validate(aNumber));
        assertTrue(restriction.validate(anInteger));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(anObject));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.OBJECT_TYPE);
        assertTrue(restriction.validate(anObject));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(anInteger));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(aString));

        restriction.setValue(Type.STRING_TYPE);
        assertTrue(restriction.validate(aString));
        assertFalse(restriction.validate(anArray));
        assertFalse(restriction.validate(aBoolean));
        assertFalse(restriction.validate(anInteger));
        assertFalse(restriction.validate(aNull));
        assertFalse(restriction.validate(aNumber));
        assertFalse(restriction.validate(anObject));
    }
}