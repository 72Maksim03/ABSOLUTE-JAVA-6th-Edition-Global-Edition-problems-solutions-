/**
 * Define a class called Fraction. This class is used to represent a ratio of two integers. Include mutator methods that allow the user to set the numerator and the
 * denominator. Also include a method that displays the fraction on the screen as a
 * ratio (e.g., 5>9). This method does not need to reduce the fraction to lowest terms.
 *  Include an additional method, equals, that takes as input another Fraction and
 * returns true if the two fractions are identical and false if they are not. This
 * method should treat the fractions reduced to lowest terms; that is, if one fraction
 * is 20>60 and the other is 1>3, then the method should return true.
 *  Embed your class in a test program that allows the user to create a fraction. Then
 * the program should loop repeatedly until the user decides to quit. Inside the body
 * of the loop, the program should allow the user to enter a target fraction into an
 * anonymous object and learn whether the fractions are identical.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator and denominator of the first fraction");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction fraction1 = new Fraction(num1, den1);

        System.out.println("Enter the numerator and denominator of the second fraction");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        Fraction fraction2 = new Fraction(num2, den2);

        if(fraction1.equals(fraction2)){
            System.out.println(fraction1 + " and " + fraction2 + " are equal");
        } else{
            System.out.println(fraction1 + " and " + fraction2 + " are not equal");
        }
    }
}
