/**
 * . (This is a better version of an exercise from Chapter 1.) A government research lab
 * has concluded that an artificial sweetener commonly used in diet soda pop causes
 * death in laboratory mice. A friend of yours is desperate to lose weight but cannot
 * give up soda pop. Your friend wants to know how much diet soda pop it is possible
 * to drink without dying as a result. Write a program to supply the answer. The
 * input to the program is the amount of artificial sweetener needed to kill a mouse,
 * the weight of the mouse, and the desired weight of the dieter. Assume that diet
 * soda contains 1/10th of 1% artificial sweetener. Use a named constant for this
 * fraction. You may want to express the percent as the double value 0.001.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static final double ARTIFICIAL_SWEETENER_IN_SODA = 0.001;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of artificial sweetener (in grams) needed to kill mouse");
        double artificialSweetener = sc.nextDouble();
        System.out.println("Enter the weight of the mouse (in grams)");
        double mouseWeight = sc.nextDouble();
        System.out.println("Enter the desired weight of the dieter (in kg)");
        double desiredWeight = sc.nextDouble();
        double lethalAmountForDieter = (artificialSweetener / mouseWeight) * desiredWeight;
        double safeAmountOfSoda = lethalAmountForDieter / ARTIFICIAL_SWEETENER_IN_SODA;
        System.out.println("Safe amount of soda is " + safeAmountOfSoda);
    }
}
