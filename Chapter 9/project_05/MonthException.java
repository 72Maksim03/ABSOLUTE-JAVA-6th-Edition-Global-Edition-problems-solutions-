public class MonthException extends RuntimeException {
    public MonthException(String message) {super(message);}
    public MonthException(){super("The Month Number Should be between 1 and 12 (inclusive)");}
}
