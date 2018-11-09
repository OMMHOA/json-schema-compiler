package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import org.junit.Before;

public class RestrictionTestFixture extends TestFixture {
    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    protected static String input1;
    protected static JsonNode input1Node;
    protected static String input2;
    protected static JsonNode input2Node;

    protected static String wrongInput1;
    protected static JsonNode wrongInput1Node;

    protected static String schema1;
    protected static JsonNode schema1Node;

    @Before
    public void setUp() throws Exception {
        input1 = getResource("input1.json");
        input2 = getResource("input2.json");
        wrongInput1 = getResource("wrongInput1.json");
        schema1 = getResource("schema1.json");

        input1Node = OBJECT_MAPPER.readTree(input1);
        input2Node = OBJECT_MAPPER.readTree(input2);
        wrongInput1Node = OBJECT_MAPPER.readTree(wrongInput1);
        schema1Node = OBJECT_MAPPER.readTree(schema1);
    }
}