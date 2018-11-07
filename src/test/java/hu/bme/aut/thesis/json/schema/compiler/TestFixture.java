package hu.bme.aut.thesis.json.schema.compiler;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class TestFixture {
    protected String getResource(String resource) throws IOException {
        return IOUtils.toString(getClass().getClassLoader().getResourceAsStream(resource));
    }
}
