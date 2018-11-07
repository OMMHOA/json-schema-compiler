package hu.bme.aut.thesis.json.schema.compiler.model;

public class Utils {
    public static String unquote(String text) {
        if (text.startsWith("\"") && text.endsWith("\""))
            return text.substring(1, text.length() - 1);
        return text;
    }
}
