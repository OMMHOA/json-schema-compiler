package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Before;

import static org.junit.Assert.*;

public class RestrictionTestFixture extends TestFixture {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static String input1;
    static JsonNode input1Node;


    @Before
    public void setUp() throws Exception {
        input1 = getResource("input1.json");
        input1Node = OBJECT_MAPPER.readTree(input1);
    }
}