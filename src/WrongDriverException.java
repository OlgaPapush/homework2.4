public class WrongDriverException extends Exception{
    public WrongDriverException() {
    }

    public WrongDriverException(String message) {
        super(message);
    }

    public WrongDriverException(String message, Throwable cause) {
        super(message, cause);
    }
}
