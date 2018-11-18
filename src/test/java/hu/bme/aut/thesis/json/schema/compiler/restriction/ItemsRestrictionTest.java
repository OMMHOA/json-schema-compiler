package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.core.JsonProcessingException;
import hu.bme.aut.thesis.json.schema.compiler.TestFixture;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemsRestrictionTest extends TestFixture {
    private ItemsRestriction restriction = new ItemsRestriction();

    @Test
    public void validate() throws JsonProcessingException {
        SchemaNode schemaForAll = getSchemaNode(schema2Node.get("properties").get("top_grades").get("items"));
        restriction.setSchemaForAll(schemaForAll);
        assertTrue(restriction.validate(input2Node.get("top_grades")));
    }
}