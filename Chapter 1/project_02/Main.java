/**
 * The video game machines at your local arcade output coupons according to
 * how well you play the game. You can redeem 10 coupons for a candy bar or 3
 * coupons for a gumball. You prefer candy bars to gumballs. Write a program that
 * defines a variable initially assigned to the number of coupons you win. Next,
 * the program should output how many candy bars and gumballs you can get if
 * you spend all of your coupons on candy bars first, and any remaining coupons
 * on gumballs.
 * */
public class Main {
    public static void main(String[] args){
        int numberOfcoupons = 69;
        int numberOfCandyBars = numberOfcoupons / 10;
        int numberOfGumballs = (numberOfcoupons % 10) / 3;
        System.out.println("Number of Candy Bars: " + numberOfCandyBars);
        System.out.println("Number of Gumballs: " + numberOfGumballs);
    }
}
