/**
 * The file words.txt on the book’s website contains 87,314 words from the English
 * language. Write a program that reads through this file and finds the word that
 * has the most consecutive vowels. For example, the word "bedouin" has three
 * consecutive vowels.
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
        String wordWithMaxConsecutiveVowels = "";
        int maxNumOfVowels = 0;
        while(sc.hasNextLine()){
            String currentWord = sc.nextLine();
            int count = 0;
            for(int i = 0; i < currentWord.length(); i++){
                switch (currentWord.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                        break;
                    default:
                        if(count > maxNumOfVowels){
                            maxNumOfVowels = count;
                            wordWithMaxConsecutiveVowels = currentWord;
                        }
                        count = 0;
                        break;
                }
            }
        }
        System.out.println("Word with maximum number of consecutive vowels is: " + wordWithMaxConsecutiveVowels);
    }
}
