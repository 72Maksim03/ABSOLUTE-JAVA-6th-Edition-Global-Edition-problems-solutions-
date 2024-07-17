/**
 * Grade point average (GPA) in a 4-point scale is calculated by using the following formula:
 * GPA = (Percentage / 100) * 4
 *  Write a program that takes as input the percentage from a user. The program
 * should then output the user’s GPA on the screen. The format of the output should
 * be as follows, assuming the user’s percentage is 85:
 * (85/100) * 4 = 3
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage");
        int percentage = sc.nextInt();
        double gpa = (percentage / 100.0) * 4;
        System.out.println("GPA is " + gpa);
    }
}
