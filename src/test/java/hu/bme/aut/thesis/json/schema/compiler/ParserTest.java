package hu.bme.aut.thesis.json.schema.compiler;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.Restriction;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParserTest extends TestFixture {

    @Test
    public void schema1() {
        SchemaNode schemaNode = Parser.parse(schema1);
        assertTrue(schemaNode.validate(input1Node));
        assertFalse(schemaNode.validate(wrongInput11Node));
        assertFalse(schemaNode.validate(wrongInput12Node));
    }

    @Test
    public void schema2() {
        SchemaNode schemaNode = Parser.parse(schema2);
        assertTrue(schemaNode.validate(input2Node));
    }

    @Test
    public void schema3() {
        SchemaNode schemaNode = Parser.parse(schema3);
        assertTrue(schemaNode.validate(input3Node));
        assertFalse(schemaNode.validate(wrongInput31Node));
        assertFalse(schemaNode.validate(wrongInput32Node));
    }

    @Test
    public void schema4() {
        SchemaNode schemaNode = Parser.parse(schema4);
        assertTrue(schemaNode.validate(input4Node));
        assertFalse(schemaNode.validate(wrongInput41Node));
        assertFalse(schemaNode.validate(wrongInput42Node));
    }

    @Test
    public void schema5() {
        SchemaNode schemaNode = Parser.parse(schema5);
        assertTrue(schemaNode.validate(input5Node));
        assertFalse(schemaNode.validate(wrongInput51Node));
        assertFalse(schemaNode.validate(wrongInput52Node));
    }

    @Test
    @Ignore // TODO: why does this fail when running all but succeeds when running alone?
    public void schema6() {
        SchemaNode schemaNode = Parser.parse(schema6);
        assertTrue(schemaNode.validate(input6Node));
    }

    @Test
    public void schema7() throws IOException {
        SchemaNode schemaNode = Parser.parse(getResource("schema7.json"));
        assertTrue(schemaNode.validate(OBJECT_MAPPER.readTree(getResource("input7.json"))));
    }

    @Test
    public void schemaEquations() throws IOException {
        String[] inputs = getResource("schemaEquations").split("\\n");
        String schema = "";
        for (String i : inputs) {
            String[] input_result = i.split(";");
            if (input_result.length == 1) {
                schema = input_result[0];
                continue;
            }
            JsonNode input = OBJECT_MAPPER.readTree(input_result[0]);
            boolean expected = Boolean.parseBoolean(input_result[1]);
            assertEquals("" + input, expected, Parser.parse(schema).validate(input));
        }
    }

    @Test
    public void equations() throws IOException {
        String[] equations = getResource("equations").split("\n");
        Restriction restriction;

        restriction = Parser.parseEquation(equations[0]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[1]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[2]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[3]);
        assertFalse(restriction.validate(null));

        restriction = Parser.parseEquation(equations[4]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[5]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[6]);
        assertTrue(restriction.validate(input1Node.get("age")));

        restriction = Parser.parseEquation(equations[7]);
        assertTrue(restriction.validate(input1Node.get("age")));

        restriction = Parser.parseEquation(equations[8]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[9]);
        assertTrue(restriction.validate(input1Node.get("age")));

        restriction = Parser.parseEquation(equations[10]);
        assertTrue(restriction.validate(null));

        restriction = Parser.parseEquation(equations[11]);
        assertTrue(restriction.validate(input1Node.get("first_name")));

        restriction = Parser.parseEquation(equations[12]);
        assertTrue(restriction.validate(input1Node));

        restriction = Parser.parseEquation(equations[13]);
        assertTrue(restriction.validate(input6Node));

        restriction = Parser.parseEquation(equations[14]);
        assertTrue(restriction.validate(input6Node));

        restriction = Parser.parseEquation(equations[15]);
        assertTrue(restriction.validate(input6Node));

        restriction = Parser.parseEquation(equations[16]);
        assertTrue(restriction.validate(input6Node));
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}