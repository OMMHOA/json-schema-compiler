package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.core.JsonProcessingException;
import hu.bme.aut.thesis.json.schema.compiler.Parser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PropertiesRestrictionTest extends RestrictionTestFixture {
    private PropertiesRestriction restriction = new PropertiesRestriction();
    private Map<String, SchemaNode> schemasMock = new HashMap<>(3);


    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void validate() throws JsonProcessingException {
        putPropertySchema("first_name");
        putPropertySchema("last_name");
        putPropertySchema("age");
        restriction.setValue(schemasMock);
        assertTrue(restriction.validate(input1Node));
    }

    private void putPropertySchema(String propertyKey) throws JsonProcessingException {
        String firstName = OBJECT_MAPPER.writeValueAsString(schema1Node.get("properties").get(propertyKey));
        schemasMock.put(propertyKey, Parser.parse(firstName));
    }
}