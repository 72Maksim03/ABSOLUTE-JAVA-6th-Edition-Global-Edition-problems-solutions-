/**
 * Suppose a text file contains the following verse from the Bible:
 *  Let us fix our eyes on Jesus, the author and perfecter of our faith, who for the joy set
 * before him endured the cross, scorning its shame, and sat down at the right hand of the
 * throne of God.
 *  Write a program that takes one of the five vowels (a, e, i, o, and u) as input from
 * the user and checks each word of the text file to determine whether or not it starts
 * with that vowel. Then, it should also display those words on the screen, one word
 * per line.
 * */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new FileInputStream("data.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
            System.exit(0);
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a vowel");
        char vowel = userInput.next().toLowerCase().charAt(0);
        System.out.println("Words starting with " + vowel + ":");
        while(sc.hasNext()){
            String word = sc.next();
            if(word.toLowerCase().charAt(0) == vowel){
                System.out.println(word);
            }
        }
    }
}
