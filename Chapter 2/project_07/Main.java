/**
 * Write a program that determines the change to be dispensed from a vending
 * machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
 * increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
 * dollar bill to pay for the item. For example, a possible sample dialogue might be
 * the following:
 *  Enter price of item
 *  (from 25 cents to a dollar, in 5-cent increments):
 *  45
 *  You bought an item for 45 cents and gave me a dollar,
 *  so your change is
 *  2 quarters,
 *  0 dimes, and
 *  1 nickels.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of item");
        System.out.println("(from 25 cents to a dollar, in 5-cent increments):");
        int price = sc.nextInt();
        int change = 100 - price;
        int quarters = change / 25;
        int dimes = (change % 25) / 10;
        int nickels = (change % 10) / 5;
        System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
        System.out.println("so your change is");
        System.out.println(quarters + " quarters, " + dimes + " dimes and " + nickels + " nickels");
    }
}