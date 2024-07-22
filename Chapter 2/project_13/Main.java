/**
 * . (This is an extension of an exercise from Chapter 1.) A simple rule to estimate your
 * ideal body weight is to allow 110 pounds for the first 5 feet of height and 5 pounds
 * for each additional inch. Create the following text in a text file. It contains the names
 * and heights in feet and inches of Tom Atto (6’3”), Eaton Wright (5’5”), and Cary
 * Oki (5’11”):
 *  Tom Atto
 *  6
 *  3
 *  Eaton Wright
 *  5
 *  5
 *  Cary Oki
 *  5
 *  11
 *  Write a program that reads the data in the file and outputs the full name and ideal
 * body weight for each person. In the next chapter, you will learn about loops, which
 * allow for a more efficient way to solve this problem.
 *
 * @author Maksim Petrosyan
 * */
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new FileInputStream("data.txt"));
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        String name1 = sc.nextLine();
        int feet1 = sc.nextInt();
        int inches1 = sc.nextInt();
        if(feet1 > 5){
            inches1 = inches1 + (feet1 - 5) * 12;
        }
        int idealBodyWeight1 = 110 + inches1 * 5;
        System.out.println("Ideal weight for " + name1 + ": " + idealBodyWeight1);
        sc.nextLine();
        String name2 = sc.nextLine();
        int feet2 = sc.nextInt();
        int inches2 = sc.nextInt();
        if(feet2 > 5){
            inches2 = inches2 + (feet1 - 5) * 12;
        }
        int idealBodyWeight2 = 110 + inches2 * 5;
        System.out.println("Ideal weight for " + name2 + ": " + idealBodyWeight2);
        sc.nextLine();
        String name3 = sc.nextLine();
        int feet3 = sc.nextInt();
        int inches3 = sc.nextInt();
        if(feet3 > 5){
            inches3 = inches3 + (feet3 - 5) * 12;
        }
        int idealBodyWeight3 = 110 + inches3 * 5;
        System.out.println("Ideal weight for " + name3 + ": " + idealBodyWeight3);
    }
}
