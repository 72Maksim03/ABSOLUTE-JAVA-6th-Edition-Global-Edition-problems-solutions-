/**
 * This problem is based on a “Nifty Assignment” by Steve Wolfman (http://nifty.
 * stanford.edu/2006/wolfman-pretid). Consider lists of numbers from real-life data
 * sources—for example, a list containing the number of students enrolled in different
 * course sections, the number of comments posted for different Facebook status updates,
 * the number of books in different library holdings, the number of votes per
 * precinct, etc. It might seem like the leading digit of each number in the list could
 * be 1–9 with an equally likely probability. However, Benford’s Law states that the
 * leading digit is 1 about 30% of the time and drops with larger digits. The leading
 * digit is 9 only about 5% of the time.
 *  Write a program that tests Benford’s Law. Collect a list of at least 100 numbers
 * from some real-life data source and enter them into a text file. Your program
 * should loop through the list of numbers and count how many times 1 is the first
 * digit, 2 is the first digit, etc. For each digit, output the percentage it appears as
 * the first digit.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        DecimalFormat df = new DecimalFormat(".##%");
        try{
            sc = new Scanner(new FileInputStream("numbers.txt"));
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        int numOfOnes = 0;
        int numOfTwos = 0;
        int numOfThrees = 0;
        int numOfFours = 0;
        int numOfFives = 0;
        int numOfSixes = 0;
        int numOfSevens = 0;
        int numOfEights = 0;
        int numOfNines = 0;
        int numOfLines = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            int firstDigit = Integer.parseInt(line.charAt(0) + "");
            numOfLines++;
            switch (firstDigit){
                case 1:
                    numOfOnes++;
                    break;
                case 2:
                    numOfTwos++;
                    break;
                case 3:
                    numOfThrees++;
                    break;
                case 4:
                    numOfFours++;
                    break;
                case 5:
                    numOfFives++;
                    break;
                case 6:
                    numOfSixes++;
                    break;
                case 7:
                    numOfSevens++;
                    break;
                case 8:
                    numOfEights++;
                    break;
                case 9:
                    numOfNines++;
                    break;
                default:
                    break;
            }
        }
        double probabilityOfOnes = (double) numOfOnes / numOfLines;
        double probabilityOfTwos = (double) numOfTwos / numOfLines;
        double probabilityOfThrees = (double) numOfThrees / numOfLines;
        double probabilityOfFours = (double) numOfFours / numOfLines;
        double probabilityOfFives = (double) numOfFives / numOfLines;
        double probabilityOfSixes = (double) numOfSixes / numOfLines;
        double probabilityOfSevens = (double) numOfSevens / numOfLines;
        double probabilityOfEights = (double) numOfEights / numOfLines;
        double probabilityOfNines = (double) numOfNines / numOfLines;

        System.out.println("Probability of 1: " + df.format(probabilityOfOnes));
        System.out.println("Probability of 2: " + df.format(probabilityOfTwos));
        System.out.println("Probability of 3: " + df.format(probabilityOfThrees));
        System.out.println("Probability of 4: " + df.format(probabilityOfFours));
        System.out.println("Probability of 5: " + df.format(probabilityOfFives));
        System.out.println("Probability of 6: " + df.format(probabilityOfSixes));
        System.out.println("Probability of 7: " + df.format(probabilityOfSevens));
        System.out.println("Probability of 8: " + df.format(probabilityOfEights));
        System.out.println("Probability of 9: " + df.format(probabilityOfNines));
    }
}
