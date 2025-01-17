public class UnknownOperatorException extends RuntimeException {
  public UnknownOperatorException(String message) {
    super(message);
  }
  public UnknownOperatorException(){super("Unknown operator");}
}
