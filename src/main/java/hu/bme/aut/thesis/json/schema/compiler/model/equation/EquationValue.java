package hu.bme.aut.thesis.json.schema.compiler.model.equation;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;
import hu.bme.aut.thesis.json.schema.compiler.model.type.*;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EquationValue implements PartOfEquation {
    private List<EquationValue> listValue;
    private Boolean booleanValue;
    private Integer integerValue;
    private Double doubleValue;
    private String stringValue;
    private boolean nullValue;
    private JsonNode objectValue;

    private List<PartOfEquation> preEvaluationListValue;
    private boolean thisValue;
    private JsonPointer pointerValue;

    private Type type;
    private boolean isEvaluated;

    @Override
    public EquationValue evaluate(JsonNode node) {
        if (isEvaluated) throw new RuntimeException("Anomaly occurred during evaluation! Evaluate called twice on " +
                "EquationValue! JsonNode: " + node);
        isEvaluated = true;
        if (type != null) return this;
        if (thisValue) {
            setTypeAndValue(node);
            return this;
        } else if (pointerValue != null) {
            setTypeAndValue(node.at(pointerValue));
            return this;
        } else if (preEvaluationListValue != null) {
            setListValue(preEvaluationListValue.stream()
                    .map(part -> part.evaluate(node))
                    .collect(Collectors.toList()));
            return this;
        }
        throw new RuntimeException("Anomaly occurred during evaluation! No type recognized. JsonNode: " + node);
    }

    private void setTypeAndValue(JsonNode node) {
        setTypeFromJson(node);
        type.setValue(node, this);
    }

    private void setTypeFromJson(JsonNode node) {
        for (Type type : CommonTypeRecognizer.TYPES.values()) {
            if (type.isType(node)) {
                this.type = type;
                return;
            }
        }
        throw new RuntimeException("JsonNode type not recognized! JsonNode: " + node);
    }

    boolean sameType(EquationValue value) {
        return type.equals(value.type);
    }

    public Type getType() {
        return type;
    }

    public boolean isList() {
        return type.isList();
    }

    public boolean isBoolean() {
        return type.isBoolean();
    }

    public boolean isInteger() {
        return type.isInteger();
    }

    public boolean isDouble() {
        return type.isDouble();
    }

    public boolean isString() {
        return type.isString();
    }

    public boolean isObject() {
        return type.isObject();
    }

    public boolean isNull() {
        return type.isNull();
    }

    public boolean canBeList() {
        return type.canBeList();
    }

    public boolean canBeBoolean() {
        return type.canBeBoolean();
    }

    public boolean canBeInteger() {
        return type.canBeInteger();
    }

    public boolean canBeDouble() {
        return type.canBeDouble();
    }

    public boolean canBeString() {
        return type.canBeString();
    }

    public List<EquationValue> asList() {
        return type.asList(this);
    }

    public Boolean asBoolean() {
        return type.asBoolean(this);
    }

    public Integer asInteger() {
        return type.asInteger(this);
    }

    public Double asDouble() {
        return type.asDouble(this);
    }

    public String asString() {
        return type.asString(this);
    }

    public List<EquationValue> getListValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return Collections.unmodifiableList(listValue);
    }

    public void setListValue(List<EquationValue> listValue) {
        this.listValue = listValue;
        type = new ListType();
    }

    public Boolean getBooleanValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        type = new BooleanType();
    }

    public Integer getIntegerValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        type = new IntegerType();
    }

    public Double getDoubleValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        type = new DoubleType();
    }

    public String getStringValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
        type = new StringType();
    }

    public boolean isNullValue() {
        if (!isEvaluated) throw new RuntimeException("EquationValue was not evaluated yet!");
        return nullValue;
    }

    public void setNullValue() {
        this.nullValue = true;
    }

    public JsonNode getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(JsonNode objectValue) {
        this.objectValue = objectValue;
    }

    public boolean isThisValue() {
        return thisValue;
    }

    public JsonPointer getPointerValue() {
        return pointerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquationValue value = (EquationValue) o;
        return Objects.equals(listValue, value.listValue) &&
                Objects.equals(booleanValue, value.booleanValue) &&
                Objects.equals(integerValue, value.integerValue) &&
                Objects.equals(doubleValue, value.doubleValue) &&
                Objects.equals(stringValue, value.stringValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listValue, booleanValue, integerValue, doubleValue, stringValue, thisValue, pointerValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquationValue{");
        if (listValue != null) sb.append("listValue=").append(listValue);
        if (booleanValue != null) sb.append(", booleanValue=").append(booleanValue);
        if (integerValue != null) sb.append(", integerValue=").append(integerValue);
        if (doubleValue != null) sb.append(", doubleValue=").append(doubleValue);
        if (stringValue != null) sb.append(", stringValue='").append(stringValue).append('\'');
        if (nullValue) sb.append(", nullValue=").append(nullValue);
        if (objectValue != null) sb.append(", objectValue=").append(objectValue);
        if (preEvaluationListValue != null) sb.append(", preEvaluationListValue=").append(preEvaluationListValue);
        if (thisValue) sb.append(", thisValue=").append(thisValue);
        if (pointerValue != null) sb.append(", pointerValue=").append(pointerValue);
        if (type != null) sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }

    private EquationValue(List<EquationValue> listValue, Boolean booleanValue, Integer integerValue, Double doubleValue,
                          String stringValue, boolean nullValue, JsonNode objectValue,
                          List<PartOfEquation> preEvaluationListValue, boolean thisValue, JsonPointer pointerValue,
                          Type type, boolean isEvaluated) {
        this.listValue = listValue;
        this.booleanValue = booleanValue;
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
        this.nullValue = nullValue;
        this.objectValue = objectValue;
        this.preEvaluationListValue = preEvaluationListValue;
        this.thisValue = thisValue;
        this.pointerValue = pointerValue;
        this.type = type;
        this.isEvaluated = isEvaluated;
    }

    public static class Builder {
        private List<EquationValue> listValue;
        private Boolean booleanValue;
        private Integer integerValue;
        private Double doubleValue;
        private String stringValue;
        private boolean nullValue;
        private JsonNode objectValue;
        private List<PartOfEquation> preEvaluationListValue;
        private boolean thisValue;
        private JsonPointer pointerValue;
        private Type type;
        private boolean isEvaluated;

        public Builder setListValue(List<EquationValue> listValue) {
            this.listValue = listValue;
            return this;
        }

        public Builder setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setDoubleValue(Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setNullValue(boolean nullValue) {
            this.nullValue = nullValue;
            return this;
        }

        public Builder setObjectValue(JsonNode objectValue) {
            this.objectValue = objectValue;
            return this;
        }

        public Builder setPreEvaluationListValue(List<PartOfEquation> preEvaluationListValue) {
            this.preEvaluationListValue = preEvaluationListValue;
            return this;
        }

        public Builder setThisValue(boolean thisValue) {
            this.thisValue = thisValue;
            return this;
        }

        public Builder setPointerValue(JsonPointer pointerValue) {
            this.pointerValue = pointerValue;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Builder setIsEvaluated(boolean isEvaluated) {
            this.isEvaluated = isEvaluated;
            return this;
        }

        public EquationValue build() {
            return new EquationValue(listValue, booleanValue, integerValue, doubleValue, stringValue, nullValue, objectValue, preEvaluationListValue, thisValue, pointerValue, type, isEvaluated);
        }
    }
}
