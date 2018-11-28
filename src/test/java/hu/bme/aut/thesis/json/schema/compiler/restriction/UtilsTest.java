package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest extends TestFixture {
    private SchemaNode ageNode;
    private SchemaNode patternNode;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        ageNode = getSchemaNode(schema1Node.get("properties").get("age"));
        patternNode = getSchemaNode(schema3Node.get("patternProperties").get("^[0-9]{4}_goal_king$"));
    }

    @Test
    public void unquote() {
        assertEquals("text", Utils.unquote("\"text\""));
        assertEquals("text", Utils.unquote("text"));
        assertEquals("te\"xt", Utils.unquote("te\"xt"));
        assertEquals("text", Utils.unquote("\\\"text\\\""));
    }

    @Test
    public void getBool() {
        assertTrue(Utils.getBool(ageNode.getExtraRestrictions().get(ExtraRestriction.exclusiveMaximum)));
        assertFalse(Utils.getBool(patternNode.getExtraRestrictions().get(ExtraRestriction.additionalItems)));
        assertNull(Utils.getBool(null));
    }
}