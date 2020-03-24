package l10.customexception;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
    }

    public CustomRuntimeException(String message) {
        super(message);
    }

}
