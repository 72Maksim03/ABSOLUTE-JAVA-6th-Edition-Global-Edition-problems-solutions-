/**
 *The Babylonian algorithm to compute the square root of a positive number n is as
 * follows:
 *  1. Make a guess at the answer (you can pick n/2 as your initial guess).
 *  2. Compute r = n / guess
 *  3. Set guess = (guess +r)/ 2
 *  4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
 * 2 and 3, the closer guess will become to the square root of n.
 *  Write a program that inputs a double for n, iterates through the Babylonian algorithm five times,
 *  and outputs the answer as a double to two decimal places. Your
 * answer will be most accurate for small values of n.
 * 
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = sc.nextDouble();
        double guess = n / 2.0;
        double r = n / guess;
        for(int i = 0; i < 5; i++){
            guess = (guess + r) / 2;
            r = n / guess;
        }
        DecimalFormat df = new DecimalFormat(".##");
        String result = df.format(guess);
        System.out.println("The answer is " + result);
    }
}
