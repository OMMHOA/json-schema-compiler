package hu.bme.aut.thesis.json.schema.compiler.model;

public class SchemaException extends RuntimeException {
    public SchemaException() {
        super();
    }

    public SchemaException(String message) {
        super(message);
    }

    public SchemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchemaException(Throwable cause) {
        super(cause);
    }

    protected SchemaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
