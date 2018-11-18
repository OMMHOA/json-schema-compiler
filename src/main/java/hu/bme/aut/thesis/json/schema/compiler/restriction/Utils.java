package hu.bme.aut.thesis.json.schema.compiler.restriction;


import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

public class Utils {
    public static String unquote(String text) {
        if (text.startsWith("\"") && text.endsWith("\""))
            return text.substring(1, text.length() - 1);
        return text;
    }

    public static Boolean getBool(JSONParser.ValueContext value) {
        return value == null ? null : value.BOOLEAN() == null ? null : Boolean.parseBoolean(value.BOOLEAN().getText());
    }
}