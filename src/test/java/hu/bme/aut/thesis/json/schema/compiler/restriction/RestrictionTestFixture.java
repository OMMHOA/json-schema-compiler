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
    protected static String input3;
    protected static JsonNode input3Node;

    protected static String wrongInput11;
    protected static JsonNode wrongInput11Node;
    protected static String wrongInput12;
    protected static JsonNode wrongInput12Node;

    protected static String schema1;
    protected static String schema2;
    protected static String schema3;
    protected static JsonNode schema1Node;

    @Before
    public void setUp() throws Exception {
        input1 = getResource("input1.json");
        input2 = getResource("input2.json");
        input3 = getResource("input3.json");
        wrongInput11 = getResource("wrongInput11.json");
        wrongInput12 = getResource("wrongInput12.json");
        schema1 = getResource("schema1.json");
        schema2 = getResource("schema2.json");
        schema3 = getResource("schema3.json");

        input1Node = OBJECT_MAPPER.readTree(input1);
        input2Node = OBJECT_MAPPER.readTree(input2);
        input3Node = OBJECT_MAPPER.readTree(input3);
        wrongInput11Node = OBJECT_MAPPER.readTree(wrongInput11);
        wrongInput12Node = OBJECT_MAPPER.readTree(wrongInput12);
        schema1Node = OBJECT_MAPPER.readTree(schema1);
    }
}