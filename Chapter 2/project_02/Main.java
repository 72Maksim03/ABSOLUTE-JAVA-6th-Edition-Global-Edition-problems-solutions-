/**
 * (This is a version with input of an exercise from Chapter 1.) Write a program that
 * inputs two string variables, first and last, which the user should enter with his or
 * her name. First, convert both strings to all lowercase. Your program should then create
 * a new string that contains the full name in pig latin with the first letter capitalized
 * for the first and last name. Use only the pig latin rule of moving the first letter to the
 * end of the word and adding “ay.” Output the pig latin name to the screen. Use the
 * substring and toUpperCase methods to construct the new name.
 *  For example, if the user inputs “Walt” for the first name and “Savitch” for the
 * last name, then the program should create a new string with the text “Altway
 * Avitchsay” and print it.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String first = sc.next();
        System.out.println("Enter your surname");
        String last = sc.next();
        String fullName = pigLatin(first) + " " + pigLatin(last);
        System.out.println(fullName);
    }

    public static String pigLatin(String str){
        str = str.toLowerCase();
        String result = str.substring(1, 2).toUpperCase() + str.substring(2) + str.charAt(0) + "ay";
        return result;
    }
}
