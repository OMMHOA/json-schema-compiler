package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONBaseVisitor;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.restrictionmapper.RestrictionMapper;
import hu.bme.aut.thesis.json.schema.compiler.restrictionmapper.TypeRestrictionMapper;

import java.util.Arrays;
import java.util.List;

public class SchemaObjectVisitor extends JSONBaseVisitor<SchemaNode> {

    // TODO: check if matches keyword for mappers
    @Override
    public SchemaNode visitObj(JSONParser.ObjContext obj) {
        SchemaNode schemaNode = new SchemaNode();
        System.out.println("starting foreach");
        RestrictionMapper.getRestrictionMappers().forEach(restrictionMapper ->
                restrictionMapper.addRestrictionsToNode(obj.pair(), schemaNode)
        );
        System.out.println("finished foreach");
        return schemaNode;
    }
}
