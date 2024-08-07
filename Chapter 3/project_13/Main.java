/**
 * The file words.txt on the book’s website contains 87,314 words from the English
 * language. Write a program that reads through this file and finds the longest word
 * that is a palindrome.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new FileInputStream("words.txt"));
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        String longestPalindrome = "";
        while(sc.hasNextLine()){
            String currentWord = sc.nextLine();
            String reverse = "";
            for(int i = currentWord.length() - 1; i >= 0; i--){
                reverse += currentWord.charAt(i);
            }
            if(reverse.equals(currentWord) && currentWord.length() > longestPalindrome.length()){
                longestPalindrome = currentWord;
            }
        }
        System.out.println("The longest palindrome is: " + longestPalindrome);
    }
}
