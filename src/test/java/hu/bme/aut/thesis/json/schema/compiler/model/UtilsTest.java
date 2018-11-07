package hu.bme.aut.thesis.json.schema.compiler.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void unquote() {
        assertEquals("text", Utils.unquote("\"text\""));
        assertEquals("text", Utils.unquote("text"));
    }
}