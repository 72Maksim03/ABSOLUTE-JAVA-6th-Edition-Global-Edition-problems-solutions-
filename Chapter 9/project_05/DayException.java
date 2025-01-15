public class DayException extends RuntimeException {
    public DayException(String message) {
        super(message);
    }
    public DayException(){super("Invalid day");}
}
