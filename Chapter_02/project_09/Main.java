/**
 * (This is a better version of an exercise from Chapter 1.) Write a program that
 * reads in a line of text and then outputs that line of text with the first occurrence of
 * "hate" changed to "love". For example, a possible sample dialogue might be the
 * following:
 *  Enter a line of text.
 *  I hate you.
 *  I have rephrased that line to read:
 *  I love you.
 *  You can assume that the word "hate" occurs in the input. If the word "hate"
 * occurs more than once in the line, your program should replace only the first
 * occurrence of "hate".
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text");
        String input = sc.nextLine();
        String result = input.replaceFirst("hate", "love");
        System.out.println("I have rephrased that line to read:");
        System.out.println(result);
    }
}
