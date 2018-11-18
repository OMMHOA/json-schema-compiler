package hu.bme.aut.thesis.json.schema.compiler.restriction;

public enum ExtraRestriction {
    additionalItems,
    additionalProperties,
    exclusiveMinimum,
    exclusiveMaximum;

    public static ExtraRestriction get(String name) {
        try {
            return ExtraRestriction.valueOf(name);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}