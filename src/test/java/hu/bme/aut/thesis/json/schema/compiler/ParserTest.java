package hu.bme.aut.thesis.json.schema.compiler;

import hu.bme.aut.thesis.json.schema.compiler.model.SchemaException;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parse() throws IOException {
        String jsonSchema = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("schema1.json"));
        SchemaNode json = Parser.parse(jsonSchema);
        assertNotNull(json);
    }

    @Test(expected = SchemaException.class)
    public void parseException() {
        Parser.parse("0");
    }
}