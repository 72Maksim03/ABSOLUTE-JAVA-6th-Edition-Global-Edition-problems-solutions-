public class InvalidBalanceException extends RuntimeException {
    public InvalidBalanceException(String message) {
        super(message);
    }

    public InvalidBalanceException(){super("Balance can not be above $5000 or below $1000");}
}
