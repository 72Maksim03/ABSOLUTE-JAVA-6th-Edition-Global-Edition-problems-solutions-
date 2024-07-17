/**
 * Write a program that reads in two numbers typed on the keyboard and divides
 * the first number by the second number. The program should output the dividend,
 * divisor, quotient, and remainder on the screen.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divident");
        int divident = sc.nextInt();
        System.out.println("Enter divisor");
        int divisor = sc.nextInt();
        int quotient = divident / divisor;
        int reminder = divident % divisor;
        System.out.println("Divident: " + divident);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: " + reminder);
    }
}
