/**
 * (This is a version of Programming Project 2.1 from Chapter 2.) The Babylonian
 * algorithm to compute the square root of a positive number n is as follows:
 *  1. Make a guess at the answer (you can pick n/2 as your initial guess).
 *  2. Compute r = n / guess.
 *  3. Set guess = (guess +r) / 2.
 *  4. Go back to step 2 until the last two guess values are within 1% of each other.
 *  Write a program that inputs a double for n, iterates through the Babylonian algorithm until the guess is within 1% of the previous guess and outputs the answer
 * as a double to two decimal places. Your answer should be accurate even for large
 * values of n.
 *
 * @author Maksim Petrosan
 * */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = sc.nextDouble();
        double guess = n / 2;
        double previousGuess;
        do{
            double r = n / guess;
            previousGuess = guess;
            guess = (guess + r) / 2;
        } while((Math.abs(previousGuess - guess) / guess) >= 0.01);
        DecimalFormat df = new DecimalFormat(".##");
        String result = df.format(guess);
        System.out.println("The aproximate square root of " + n + ": " + result);
    }
}
