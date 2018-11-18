package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.core.JsonProcessingException;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PropertiesRestrictionTest extends TestFixture {
    private PropertiesRestriction restriction = new PropertiesRestriction();
    private Map<String, SchemaNode> schemasMock = new HashMap<>(3);

    @Test
    public void validate() throws JsonProcessingException {
        putPropertySchema("first_name");
        putPropertySchema("last_name");
        putPropertySchema("age");
        restriction.setProperties(schemasMock);
        assertTrue(restriction.validate(input1Node));
    }

    @Test
    public void validatePattern() throws JsonProcessingException {
        Map<String, SchemaNode> patternNodes = new HashMap<>(1);
        patternNodes.put("^a.*$", getSchemaNode(schema1Node.get("properties").get("age")));
        restriction.setPatternProperties(patternNodes);

        assertTrue(restriction.validate(input1Node));
        assertFalse(restriction.validate(input2Node));
    }

    private void putPropertySchema(String propertyKey) throws JsonProcessingException {
        SchemaNode firstName = getSchemaNode(schema1Node.get("properties").get(propertyKey));
        schemasMock.put(propertyKey, firstName);
    }
}