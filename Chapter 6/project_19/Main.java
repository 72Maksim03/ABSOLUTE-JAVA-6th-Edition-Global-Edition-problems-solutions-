import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Some word games require the player to find words that can be formed using the letters of another word. For example, given the word SWIMMING, other words that
 * can be formed using the letters include SWIM, WIN, WING, SING, MIMING,
 * etc. Write a program that lets the user enter a word and then output all the words
 * contained in the file words.txt that can be formed from the letters of the entered
 * word. One algorithm to do this is to compare the letter histograms for each word.
 * Create an array that counts up the number of each letter in the entered word (e.g.,
 * one S, one W, two I, two M, etc.) and then creates a similar array for the current
 * word read from the file. The two arrays can be compared to see if the word from
 * the file could be created out of the letters from the entered word.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("words.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = kb.next();
        int[] inputHistogram = createHistogram(word);

        System.out.println("Words that can be formed");
        while(sc.hasNext()){
            String wordToCheck = sc.next();
            if (checkHistograms(inputHistogram, createHistogram(wordToCheck)))
                System.out.println(wordToCheck);
        }
    }

    public static int[] createHistogram(String word){
        String temp = word.toLowerCase();
        int[] result = new int[26];
        for (int i = 0; i < temp.length(); i++) result[temp.charAt(i) - 'a']++;
        return result;
    }

    public static boolean checkHistograms(int[] input, int[] wordToCheck){
        for (int i = 0; i < input.length; i++)
            if(input[i] < wordToCheck[i]) return false;
        return true;
    }
}
