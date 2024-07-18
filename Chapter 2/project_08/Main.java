/**
 * Write a program that reads in a string containing three words separated by commas
 * and then outputs that string with each word in a different line.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 words separated by comma");
        String input = sc.nextLine();
        String[] words = input.split(",");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i].trim());
        }
    }
}
