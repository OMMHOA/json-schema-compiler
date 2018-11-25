package hu.bme.aut.thesis.json.schema.compiler.restriction;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import hu.bme.aut.thesis.json.schema.compiler.model.SchemaNode;
import hu.bme.aut.thesis.json.schema.compiler.visitor.ObjectVisitor;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.getBool;
import static hu.bme.aut.thesis.json.schema.compiler.restriction.Utils.unquote;

public class PropertiesRestriction implements Restriction {
    private Map<String, SchemaNode> properties;
    private Map<String, SchemaNode> patternProperties;
    private boolean additionalProperties = true;

    public PropertiesRestriction(JSONParser.ValueContext value) {
        this(value, false);
    }

    public PropertiesRestriction(JSONParser.ValueContext value, boolean patternProperties) {
        if (patternProperties) {
            this.patternProperties = convertValue(value);
        } else {
            properties = convertValue(value);
        }
    }

    protected Map<String, SchemaNode> convertValue(JSONParser.ValueContext value) {
        return value.obj().pair().stream()
                .collect(Collectors.toMap(
                        pair -> unquote(pair.STRING().getText()),
                        pair -> pair.value().obj().accept(new ObjectVisitor()),
                        (a, b) -> b));
    }

    @Override
    public boolean validate(JsonNode jsonNode) {
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while (fields.hasNext()) {
            if (!isFieldValid(fields.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void apply(Map<ExtraRestriction, JSONParser.ValueContext> extraRestrictions) {
        Boolean val;
        if ((val = getBool(extraRestrictions.get(ExtraRestriction.additionalProperties))) != null) {
            additionalProperties = val;
        }
    }

    private boolean isFieldValid(Map.Entry<String, JsonNode> field) {
        SchemaNode fieldNode = getFieldNode(field.getKey());
        if (fieldNode == null) {
            fieldNode = getPatternFieldNode(field.getKey());
        }
        if (fieldNode != null) {
            return fieldNode.validate(field.getValue());
        }
        return additionalProperties;
    }

    private SchemaNode getFieldNode(String key) {
        return properties == null ? null : properties.get(key);
    }

    private SchemaNode getPatternFieldNode(String key) {
        if (patternProperties == null) return null;
        for (String pattern : patternProperties.keySet()) {
            if (key.matches(pattern)) {
                return patternProperties.get(pattern);
            }
        }
        return null;
    }

    public void addProperties(JSONParser.ValueContext value) {
        Map<String, SchemaNode> newProps = convertValue(value);
        if (properties == null) {
            properties = newProps;
        } else {
            properties.putAll(newProps);
        }
    }

    public void addPatternProperties(JSONParser.ValueContext value) {
        Map<String, SchemaNode> newProps = convertValue(value);
        if (patternProperties == null) {
            patternProperties = newProps;
        } else {
            patternProperties.putAll(newProps);
        }
    }

    PropertiesRestriction() {
    }

    public void setProperties(Map<String, SchemaNode> properties) {
        this.properties = properties;
    }

    public void setPatternProperties(Map<String, SchemaNode> patternProperties) {
        this.patternProperties = patternProperties;
    }
}
