/**
 * Redo or do for the first time Programming Project 2.13 from Chapter 2, but this
 * time use a loop to read the names from the file. Your program should also handle
 * an arbitrary number of entries in the file instead of handling only three entries.
 * To do this, your program must check to see if there is still data left to read (i.e., it
 * has reached the end of the file). The appropriate methods to read from a file are
 * described in Section 2.3.
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
            sc = new Scanner(new FileInputStream("data.txt"));
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            int feet = sc.nextInt();
            int inches = sc.nextInt();
            if(feet > 5){
                inches = inches + (feet - 5) * 12;
            }
            int idealBodyWeight = 110 + inches * 5;
            System.out.println("Ideal weight for " + name + ": " + idealBodyWeight);
            if(sc.hasNextLine()){
                sc.nextLine();
            }
        }
    }
}