package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.model.Parser;
import hu.bme.aut.thesis.json.schema.compiler.model.JsonSchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.jsontype.JsonSchemaJson;
import hu.bme.aut.thesis.json.schema.compiler.model.objecttype.JsonSchemaObject;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parse() throws IOException {
        String jsonSchema = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("schema1.json"));
        JsonSchemaJson json = Parser.parse(jsonSchema);
        assertNotNull(json);
        assertEquals(1, json.getChildren().size());
        assertTrue(json.getChildren().get(0) instanceof JsonSchemaObject);
    }

    @Test(expected = JsonSchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}