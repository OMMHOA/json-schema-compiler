package hu.bme.aut.thesis.json.schema.compiler.visitor;

import hu.bme.aut.thesis.json.schema.compiler.generated.JSONParser;
import org.slf4j.Logger;

public class Utils {
    static void warnValue(JSONParser.ValueContext value, Logger logger) {
        logger.warn("value.array: {}", value.array());
        logger.warn("value.INT: {}", value.INT());
        logger.warn("value.NUMBER: {}", value.NUMBER());
        logger.warn("value.STRING: {}", value.STRING());
        logger.warn("value.BOOLEAN: {}", value.BOOLEAN());
        logger.warn("value.NULL: {}", value.NULL());
    }
}
