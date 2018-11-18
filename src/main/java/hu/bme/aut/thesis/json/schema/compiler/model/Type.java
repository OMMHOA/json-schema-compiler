package hu.bme.aut.thesis.json.schema.compiler.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Sets;

import java.util.Set;
import java.util.function.Function;

public enum Type {
    ARRAY_TYPE("array", JsonNode::isArray),
    BOOLEAN_TYPE("boolean", JsonNode::isBoolean, (first, second) -> first.asBoolean() == second.asBoolean()),
    INTEGER_TYPE("integer", JsonNode::isInt, (first, second) -> first.asInt() == second.asInt()),
    NULL_TYPE("null", JsonNode::isNull, (first, second) -> true),
    NUMBER_TYPE("number", JsonNode::isNumber, (first, second) -> first.asDouble() == second.asDouble()),
    OBJECT_TYPE("object", JsonNode::isObject),
    STRING_TYPE("string", JsonNode::isTextual, (first, second) -> first.asText().equals(second.asText()));

    @FunctionalInterface
    private interface EqualityChecker {
        boolean apply(JsonNode first, JsonNode second);
    }
    private final String name;
    private final Function<JsonNode, Boolean> checker;
    private EqualityChecker equalityChecker;

    static {
        ARRAY_TYPE.equalityChecker = (first, second) -> {
            if (first == null && second == null) return true;
            if (first == null || second == null || first.size() != second.size()) return false;
            for (int i = 0; i < first.size(); i++) {
                if (!jsonNodesEqual(first.get(i), second.get(i))) {
                    return false;
                }
            }
            return true;
        };

        OBJECT_TYPE.equalityChecker = (first, second) -> {
            if (first == null && second == null) return true;
            if (first == null || second == null || first.size() != second.size()) return false;
            Set<String> firstFieldNames = Sets.newHashSet(first.fieldNames());
            Set<String> secondFieldNames = Sets.newHashSet(second.fieldNames());
            if (!firstFieldNames.equals(secondFieldNames)) return false;
            for (String fieldName : firstFieldNames) {
                if (!jsonNodesEqual(first.get(fieldName), second.get(fieldName))) {
                    return false;
                }
            }
            return true;
        };
    }

    Type(String name, Function<JsonNode, Boolean> checker) {
        this.name = name;
        this.checker = checker;
    }

    Type(String name, Function<JsonNode, Boolean> checker, EqualityChecker equalityChecker) {
        this.name = name;
        this.checker = checker;
        this.equalityChecker = equalityChecker;
    }

    public Function<JsonNode, Boolean> getChecker() {
        return checker;
    }

    public static Type get(String name) {
        for (Type t : Type.values()) {
            if (t.name.equals(name)) return t;
        }
        return null;
    }

    public static Boolean jsonNodesEqual(JsonNode first, JsonNode second) {
        for (Type t : Type.values()) {
            if (t.checker.apply(first)) {
                if (t.checker.apply(second)) {
                    return t.equalityChecker.apply(first, second);
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
