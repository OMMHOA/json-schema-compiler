package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restriction.TypeRestriction;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest extends TestFixture {

    @Test
    public void parseSchema1() throws IOException {
        String jsonSchema = getResource("schema1.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNotNull(json.getChildren());
        assertEquals(4, json.getChildren().size());
    }

    @Test
    public void parseSchema2() throws IOException {
        String jsonSchema = getResource("schema2.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNotNull(json.getChildren());
        assertEquals(1, json.getChildren().size());
    }

    @Test
    public void parseSchema3() throws IOException {
        String jsonSchema = getResource("schema3.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNull(json.getChildren());
        assertNotNull(json.getPatternChildren());
        assertEquals(1, json.getPatternChildren().size());

    }

    @Test
    public void parseSchema4() throws IOException {
        String jsonSchema = getResource("schema4.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNull(json.getChildren());
    }

    @Test
    public void parseSchema5() throws IOException {
        String jsonSchema = getResource("schema5.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNull(json.getChildren());
    }

    @Test
    public void parseSchema6() throws IOException {
        String one = "\"one\"";
        String two = "\"two\"";
        String three = "\"three\"";
        String jsonSchema = getResource("schema6.json");
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertNotNull(json.getChildren());
        assertNotNull(json.getChildren().get(one));
        assertNotNull(json.getChildren().get(one).getChildren());
        assertNotNull(json.getChildren().get(one).getChildren().get(two));
        assertNotNull(json.getChildren().get(one).getChildren().get(two).getPatternChildren());
        assertNotNull(json.getChildren().get(one).getChildren().get(two).getPatternChildren().get(three));
        SchemaNode threeNode = json.getChildren().get(one).getChildren().get(two).getPatternChildren().get(three);
        assertNotNull(threeNode.getRestrictions());
        assertEquals(1, threeNode.getRestrictions().size());
        assertTrue(threeNode.getRestrictions().get(0) instanceof TypeRestriction);
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}