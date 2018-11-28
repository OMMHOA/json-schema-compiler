package hu.bme.aut.thesis.json.schema.compiler.model.type;

import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.equation.EquationValue;

import java.util.Objects;

public abstract class Type {
    private String name;

    protected Type(String name) {
        this.name = name;
    }

    public abstract boolean isType(JsonNode jsonNode);

    public abstract void setValue(JsonNode jsonNode, EquationValue equationValue);

    public boolean isList() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isInteger() {
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isNull() {
        return false;
    }

    public boolean canBeList() {
        return isList();
    }

    public boolean canBeBoolean() {
        return isBoolean();
    }

    public boolean canBeInteger() {
        return isInteger();
    }

    public boolean canBeDouble() {
        return isDouble();
    }

    public boolean canBeString() {
        return isString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(name, type.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }
}
