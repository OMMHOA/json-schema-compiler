package hu.bme.aut.thesis.json.schema.compiler.model.equation;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EquationValue implements PartOfEquation {
    private List<EquationValue> listValue;
    private Boolean booleanValue;
    private Integer integerValue;
    private Double doubleValue;
    private String stringValue;
    private boolean thisValue;
    private JsonPointer pointerValue;

    @Override
    public EquationValue evaluate(JsonNode jsonNode) {
        return this;
    }

    public List<EquationValue> getListValue() {
        return Collections.unmodifiableList(listValue);
    }

    public void setListValue(List<EquationValue> listValue) {
        this.listValue = listValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public boolean isThisValue() {
        return thisValue;
    }

    public void setThisValue(boolean thisValue) {
        this.thisValue = thisValue;
    }

    public JsonPointer getPointerValue() {
        return pointerValue;
    }

    public void setPointerValue(JsonPointer pointerValue) {
        this.pointerValue = pointerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquationValue value = (EquationValue) o;
        return thisValue == value.thisValue &&
                Objects.equals(listValue, value.listValue) &&
                Objects.equals(booleanValue, value.booleanValue) &&
                Objects.equals(integerValue, value.integerValue) &&
                Objects.equals(doubleValue, value.doubleValue) &&
                Objects.equals(stringValue, value.stringValue) &&
                Objects.equals(pointerValue, value.pointerValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue, booleanValue, integerValue, doubleValue, stringValue, thisValue, pointerValue);
    }

    private EquationValue(List<EquationValue> listValue, Boolean booleanValue, Integer integerValue, Double doubleValue, String stringValue, boolean thisValue, JsonPointer pointerValue) {
        this.listValue = listValue;
        this.booleanValue = booleanValue;
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
        this.thisValue = thisValue;
        this.pointerValue = pointerValue;
    }

    public static class Builder {
        private List<EquationValue> listValue;
        private Boolean booleanValue;
        private Integer integerValue;
        private Double doubleValue;
        private String stringValue;
        private boolean thisValue;
        private JsonPointer pointerValue;

        public EquationValue.Builder setListValue(List<EquationValue> listValue) {
            this.listValue = listValue;
            return this;
        }

        public EquationValue.Builder setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public EquationValue.Builder setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public EquationValue.Builder setDoubleValue(Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public EquationValue.Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public EquationValue.Builder setThisValue(boolean thisValue) {
            this.thisValue = thisValue;
            return this;
        }

        public EquationValue.Builder setPointerValue(JsonPointer pointerValue) {
            this.pointerValue = pointerValue;
            return this;
        }

        public EquationValue build() {
            return new EquationValue(listValue, booleanValue, integerValue, doubleValue, stringValue, thisValue, pointerValue);
        }
    }
}
