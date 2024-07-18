/**
 * Write a program that calculates the total grade for three classroom exercises as a
 * percentage. Use the DecimalFormat class to output the value as a percent. The
 * scores should be summarized in a table. Input the assignment information in this
 * order: name of assignment (may include spaces), points earned (integer), and total
 * points possible (integer). The percentage is the sum of the total points earned divided
 * by the total points possible. Sample input and output are shown as follows:
 * Name of exercise 1:
 *  Group Project
 *  Score received for exercise 1:
 *  10
 *  Total points possible for exercise 1:
 *  10
 *  Name of exercise 2:
 *  Homework
 *  Score received for exercise 2:
 *  7
 *  Total points possible for exercise 2:
 *  12
 *  Name of exercise 3:
 *  Presentation
 *  Score received for exercise 3:
 *  5
 *  Total points possible for exercise 3:
 *  8
 * Exercise Score Total Possible
 * Group Project 10 10
 * Homework 7 12
 * Presentation 5 8
 * Total 22 30
 *  Your total is 22 out of 30, or 73.33%.
 *
 * @author Maksim Petrosyan
 * */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.##%");
        String[] exercises = new String[3];
        int[] scores = new int[3];
        int[] totalPossible = new int[3];
        int totalEarned = 0;
        int totalPoints = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Name of exercise " + (i + 1) + ":");
            exercises[i] = sc.nextLine();
            System.out.println("Score received for exercise " + (i + 1) + ":");
            scores[i] = sc.nextInt();
            System.out.println("Total points possible for exercise " + (i + 1) + ":");
            totalPossible[i] = sc.nextInt();
            sc.nextLine();
            totalEarned += scores[i];
            totalPoints += totalPossible[i];
        }
        System.out.printf("%-40s %-10s %-20s%n", "Exercise", "Score", "Total Possible");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-40s %-10s %-20s%n", exercises[i], scores[i], totalPossible[i]);
        }
        System.out.printf("%-40s %-10s %-20s%n", "Total", totalEarned, totalPoints);
        double percentage = (double) totalEarned / totalPoints;
        String formattedPercentage = df.format(percentage);
        System.out.println("Your total is " + totalEarned + " out of " + totalPoints + ", or " + formattedPercentage);
    }
}
