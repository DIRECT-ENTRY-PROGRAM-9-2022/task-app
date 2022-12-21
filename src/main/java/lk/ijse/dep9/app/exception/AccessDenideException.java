package lk.ijse.dep9.app.exception;

public class AccessDenideException extends RuntimeException{
    public AccessDenideException() {
        super();
    }

    public AccessDenideException(String message) {
        super(message);
    }

    public AccessDenideException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDenideException(Throwable cause) {
        super(cause);
    }

    protected AccessDenideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
