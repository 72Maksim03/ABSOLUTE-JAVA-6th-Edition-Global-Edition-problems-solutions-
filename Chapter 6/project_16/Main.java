import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Programming Project 3.15 asked you to explore Benford’s Law. An easier way to
 * write the program is to use an array to store the digit counts. That is, count[0]
 * might store the number of times 0 is the first digit (if that is possible in your data
 * set), count[1] might store the number of times 1 is the first digit, and so forth.
 * Redo Programming Project 3.15 using arrays.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        System.out.printf("%.2f%n" ,BenfordLaw("numbers.txt"));
    }

    public static double BenfordLaw(String source){
        int[] numOfDigits = new int[10];
        Scanner sc;
        try{
            sc = new Scanner(new File(source));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            return 0;
        }
        while(sc.hasNext()){
            String number = sc.nextLine();
            if (number.charAt(0) - '0' >= 0 && number.charAt(0) - '0' <= 9)
                numOfDigits[number.charAt(0) - '0']++;
            else{
                System.out.println("Invalid data");
                return 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < numOfDigits.length; i++) sum += numOfDigits[i];
        return 100 * ((double) numOfDigits[1]) / ((double) sum);
    }
}
