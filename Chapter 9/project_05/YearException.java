public class YearException extends RuntimeException {
    public YearException(String message) {
        super(message);
    }
    public YearException(){super("Invalid year. Year should be between 1000 and 3000");}
}
