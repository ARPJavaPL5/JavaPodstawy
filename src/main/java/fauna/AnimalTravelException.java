package fauna;

public class AnimalTravelException extends Exception {
    public AnimalTravelException() {
    }

    public AnimalTravelException(String message) {
        super(message);
    }

    public AnimalTravelException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalTravelException(Throwable cause) {
        super(cause);
    }
}
