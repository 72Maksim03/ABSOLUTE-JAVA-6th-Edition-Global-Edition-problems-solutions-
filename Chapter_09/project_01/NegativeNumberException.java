public class NegativeNumberException extends Exception {
    public NegativeNumberException(){super("Number must be positive");}
    public NegativeNumberException(String message){super(message);}
}
