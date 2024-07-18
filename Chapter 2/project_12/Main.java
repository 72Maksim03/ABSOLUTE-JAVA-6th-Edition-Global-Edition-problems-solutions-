/**
 * . (This is a variant of an exercise from Chapter 1.) Create a text file that contains the
 * text "I hate programming!" Write a program that reads in this line of text from
 * the file and then the text with the first occurrence of "hate" changed to "love". In
 * this case, the program would output "I love programming!" Your program should
 * work with any line of text that contains the word "hate", not just the example given
 * in this problem. If the word "hate" occurs more than once in the line, your program
 * should replace only the first occurrence of "hate".
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
            sc = new Scanner(new FileInputStream("text.txt"));
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        while(sc.hasNextLine()){
            String input = sc.nextLine().replaceFirst("hate", "love");
            System.out.println(input);
        }
    }
}
