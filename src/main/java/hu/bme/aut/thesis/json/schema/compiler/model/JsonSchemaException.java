package hu.bme.aut.thesis.json.schema.compiler.model;

public class JsonSchemaException extends RuntimeException {
    public JsonSchemaException() {
        super();
    }

    public JsonSchemaException(String message) {
        super(message);
    }

    public JsonSchemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonSchemaException(Throwable cause) {
        super(cause);
    }

    protected JsonSchemaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
