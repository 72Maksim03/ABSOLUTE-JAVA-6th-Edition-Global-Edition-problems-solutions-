public class Calculator {
    private double result = 0.0;

    /**
     * Constructs a Calculator object with an initial result of 0.0.
     */
    public Calculator(){}

    /**
     * Returns the current result of the calculator.
     *
     * @return the current result
     */
    public double getResult(){return result;}

    /**
     * Performs a calculation based on the provided operation string.
     * The string should start with an operator ('+', '-', '*', '/')
     * followed by a numeric value.
     *
     * @param op the operation string
     * @throws IllegalArgumentException if the number is invalid or division by zero occurs
     * @throws UnknownOperatorException if the operator is unrecognized
     */
    public void calc(String op) throws IllegalArgumentException, UnknownOperatorException{
        char oper = op.charAt(0);
        double num;
        try{
            num = Double.parseDouble(op.substring(1));
        } catch(Exception e){
            throw new IllegalArgumentException("Invalid number. Please try again");
        }
        switch(oper){
            case '+':
                result += num;
                break;
            case '-':
                result -= num;
                break;
            case '*':
                result *= num;
                break;
            case '/':
                if (num == 0) throw new IllegalArgumentException("denominator can not be 0");
                result /= num;
                break;
            default:
                throw new UnknownOperatorException(oper + " unknown operation. Please try again");
        }
    }
}
