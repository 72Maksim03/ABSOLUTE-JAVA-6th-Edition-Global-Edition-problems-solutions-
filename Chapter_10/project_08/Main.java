import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Create a file WordBuff.txt that contains the following list of words: MADAM,
 * DAD, RISK, JAVA, MALAYALAM, RACECAR, RADAR, ROTOR, REFER,
 * SEDES, SOLOS, COURSE, STATS, TOROT, TENET, MACHINE, VIRTUAL,
 * STUDENT, PULLUP, PROGRAMME, and CORE. Write a program that reads
 * each word from the file and outputs the number of palindromes in the file.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("WordBuff.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }
        int count = 0;
        while (sc.hasNext()){
            String word = sc.next();
            if (isPalindrome(word)) count++;
        }
        System.out.println("Number of palindromes: " + count);
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i <= n/2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }
}
