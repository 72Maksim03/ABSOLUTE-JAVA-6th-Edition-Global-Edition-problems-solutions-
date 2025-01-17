/**
 * Write a program that calculates the total grade for N classroom exercises as a percentage.
 * Use the DecimalFormat class to output the value as a percent. The user
 * should input the value for N followed by each of the N scores and totals. Calculate
 * the overall percentage (sum of the total points earned divided by the total points
 * possible) and output it using the DecimalFormat class. Sample input and output
 * are shown below.
 *  How many exercises to input?
 *  3
 *  Score received for exercise 1:
 *  10
 *  Total points possible for exercise 1:
 *  10
 *  Score received for exercise 2:
 *  7
 *  Total points possible for exercise 2:
 *  12
 *  Score received for exercise 3:
 *  5
 *  Total points possible for exercise 3:
 *  8
 *  Your total is 22 out of 30, or 73.33%.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many exercises to input?");
        int numOfExercises = sc.nextInt();
        int totalScoreReceived = 0;
        int totalScorePossible = 0;
        for(int i = 1; i <= numOfExercises; i++){
            System.out.println("Score received for exercise " + i + ":");
            int receivedScore = sc.nextInt();
            System.out.println("Total points possible for exercise " + i + ":");
            int possibleScore = sc.nextInt();
            totalScoreReceived += receivedScore;
            totalScorePossible += possibleScore;
        }
        DecimalFormat df = new DecimalFormat(".##%");
        double percentageForCourse = (double) totalScoreReceived / totalScorePossible;
        String res = df.format(percentageForCourse);
        System.out.println("Your total is " + totalScoreReceived + " out of " + totalScorePossible
                + " , or " + res);
    }
}
