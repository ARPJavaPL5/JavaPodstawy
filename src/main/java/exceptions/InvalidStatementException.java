package exceptions;

public class InvalidStatementException extends Exception {
    public InvalidStatementException(String message) {
        super(message);
    }

    public InvalidStatementException(String message, Throwable cause) {
        super(message, cause);
    }
}