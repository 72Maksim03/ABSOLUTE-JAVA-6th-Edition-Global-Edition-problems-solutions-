public class DenominatorIsZeroException extends RuntimeException {
    public DenominatorIsZeroException(String message) {
        super(message);
    }
    public DenominatorIsZeroException(){super("Denominator can not be 0");}
}
