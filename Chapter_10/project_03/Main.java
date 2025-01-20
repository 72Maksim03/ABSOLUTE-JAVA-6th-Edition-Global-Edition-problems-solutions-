import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Write a program that takes its input from a text file of strings representing numbers
 * of type double and outputs the average of the numbers in the file to the screen. The
 * file contains nothing but strings representing numbers of type double, one per line.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("numbers.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }

        double sum = 0;
        int count = 0;
        while(sc.hasNext()){
            double number = sc.nextDouble();
            sum += number;
            count++;
        }

        if (count == 0) System.out.println("Average is 0");
        else System.out.println("Average is " + (sum / count));
    }
}
