/**
 * (This is a version of an exercise from Chapter 5) Programming Project 5.2 from
 * Chapter 5 asked you to create a class named Fraction. This class is used to
 * represent a ratio of two integers. It should include mutator functions that allow
 * the user to set the numerator and the denominator along with a method that
 * displays the fraction on the screen as a ratio (e.g., 5/9). Modify the class so that
 * it throws the exception DenominatorIsZeroException if the denominator is set
 * to zero. Do not forget to account for the constructors! You will have to create the
 * DenominatorIsZeroException class and it should be derived from Exception.
 *  Write a main method that tests the new Fraction class, attempts to set the
 * denominator to zero, and catches the DenominatorIsZeroException exception.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        try{
            Fraction fr1 = new Fraction(5, 9);
            System.out.println(fr1);
            Fraction fr2 = new Fraction(6, 15);
            System.out.println(fr2);
            Fraction fr3 = new Fraction(2, 0);
            System.out.println(fr3);
        } catch (DenominatorIsZeroException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
