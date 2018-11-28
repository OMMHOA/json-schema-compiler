package hu.bme.aut.thesis.json.schema.compiler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.apache.commons.io.IOUtils;
import org.junit.Before;

import java.io.IOException;

public class TestFixture {
    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    protected static String input1;
    protected static JsonNode input1Node;
    protected static String input2;
    protected static JsonNode input2Node;
    protected static String input3;
    protected static JsonNode input3Node;
    protected static String input4;
    protected static JsonNode input4Node;
    protected static String input5;
    protected static JsonNode input5Node;
    protected static String input6;
    protected static JsonNode input6Node;

    protected static String wrongInput11;
    protected static JsonNode wrongInput11Node;
    protected static String wrongInput12;
    protected static JsonNode wrongInput12Node;
    protected static String wrongInput31;
    protected static JsonNode wrongInput31Node;
    protected static String wrongInput32;
    protected static JsonNode wrongInput32Node;
    protected static String wrongInput41;
    protected static JsonNode wrongInput41Node;
    protected static String wrongInput42;
    protected static JsonNode wrongInput42Node;
    protected static String wrongInput51;
    protected static JsonNode wrongInput51Node;
    protected static String wrongInput52;
    protected static JsonNode wrongInput52Node;

    protected static String schema1;
    protected static JsonNode schema1Node;
    protected static String schema2;
    protected static JsonNode schema2Node;
    protected static String schema3;
    protected static JsonNode schema3Node;
    protected static String schema4;
    protected static JsonNode schema4Node;
    protected static String schema5;
    protected static JsonNode schema5Node;
    protected static String schema6;
    protected static JsonNode schema6Node;


    @Before
    public void setUp() throws Exception {
        input1 = getResource("input1.json");
        input2 = getResource("input2.json");
        input3 = getResource("input3.json");
        input4 = getResource("input4.json");
        input5 = getResource("input5.json");
        input6 = getResource("input6.json");
        wrongInput11 = getResource("wrongInput11.json");
        wrongInput12 = getResource("wrongInput12.json");
        wrongInput31 = getResource("wrongInput31.json");
        wrongInput32 = getResource("wrongInput32.json");
        wrongInput41 = getResource("wrongInput41.json");
        wrongInput42 = getResource("wrongInput42.json");
        wrongInput51 = getResource("wrongInput51.json");
        wrongInput52 = getResource("wrongInput52.json");
        schema1 = getResource("schema1.json");
        schema2 = getResource("schema2.json");
        schema3 = getResource("schema3.json");
        schema4 = getResource("schema4.json");
        schema5 = getResource("schema5.json");
        schema6 = getResource("schema6.json");

        input1Node = OBJECT_MAPPER.readTree(input1);
        input2Node = OBJECT_MAPPER.readTree(input2);
        input3Node = OBJECT_MAPPER.readTree(input3);
        input4Node = OBJECT_MAPPER.readTree(input4);
        input5Node = OBJECT_MAPPER.readTree(input5);
        input6Node = OBJECT_MAPPER.readTree(input6);
        wrongInput11Node = OBJECT_MAPPER.readTree(wrongInput11);
        wrongInput12Node = OBJECT_MAPPER.readTree(wrongInput12);
        wrongInput31Node = OBJECT_MAPPER.readTree(wrongInput31);
        wrongInput32Node = OBJECT_MAPPER.readTree(wrongInput32);
        wrongInput41Node = OBJECT_MAPPER.readTree(wrongInput41);
        wrongInput42Node = OBJECT_MAPPER.readTree(wrongInput42);
        wrongInput51Node = OBJECT_MAPPER.readTree(wrongInput51);
        wrongInput52Node = OBJECT_MAPPER.readTree(wrongInput52);
        schema1Node = OBJECT_MAPPER.readTree(schema1);
        schema2Node = OBJECT_MAPPER.readTree(schema2);
        schema3Node = OBJECT_MAPPER.readTree(schema3);
        schema4Node = OBJECT_MAPPER.readTree(schema4);
        schema5Node = OBJECT_MAPPER.readTree(schema5);
        schema6Node = OBJECT_MAPPER.readTree(schema6);
    }

    public SchemaNode getSchemaNode(JsonNode jsonNode) throws JsonProcessingException {
        return Parser.parse(OBJECT_MAPPER.writeValueAsString(jsonNode));
    }

    public String getResource(String resource) throws IOException {
        return IOUtils.toString(getClass().getClassLoader().getResourceAsStream(resource));
    }
}
