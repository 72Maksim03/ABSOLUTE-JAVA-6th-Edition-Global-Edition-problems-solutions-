import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
/**
 * Write a program that will count the total occurrences of the number ‘10’ in a text
 * file of strings representing numbers of type int and will show the value of the
 * count on the screen once the whole file is read. The file contains the following
 * numbers separated by space.
 * 10 4 7 8 10 34 11 10 15 6 10
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

        int count = 0;
        while(sc.hasNext()){
            int num = sc.nextInt();
            if (num == 10) count++;
        }

        System.out.println(10 + " appears " + count + " times");
    }
}
