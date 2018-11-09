package hu.bme.aut.thesis.json.schema.compiler.restriction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void unquote() {
        assertEquals("text", Utils.unquote("\"text\""));
        assertEquals("text", Utils.unquote("text"));
    }
}