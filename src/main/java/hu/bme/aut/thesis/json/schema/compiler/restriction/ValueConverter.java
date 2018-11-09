package hu.bme.aut.thesis.json.schema.compiler.restriction;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;

class ValueConverter {
    static Integer toInt(JSONParser.ValueContext value) {
        return Integer.parseInt(value.INT().getText());
    }

    static Double toDouble(JSONParser.ValueContext value) {
        if (value.NUMBER() == null)
            return Double.parseDouble(value.INT().getText());
        return Double.parseDouble(value.NUMBER().getText());
    }

    static String toString(JSONParser.ValueContext value) {
        return Utils.unquote(value.STRING().getText());
    }

    static Boolean toBoolean(JSONParser.ValueContext value) {
        return Boolean.parseBoolean(value.BOOLEAN().getText());
    }
}
