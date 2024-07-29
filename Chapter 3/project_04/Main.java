/**
 * It is difficult to make a budget that spans several years, because prices are not stable.
 * If your company needs 200 pencils per year, you cannot simply use this year’s price
 * as the cost of pencils two years from now. Because of inflation, the cost is likely to
 * be higher than it is today. Write a program to gauge the expected cost of an item in
 * a specified number of years. The program asks for the cost of the item, the number
 * of years from now that the item will be purchased, and the rate of inflation. The
 * program then outputs the estimated cost of the item after the specified period.
 * Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
 * program should then convert the percent to a fraction, such as 0.056 and should
 * use a loop to estimate the price adjusted for inflation.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Enter the current cost of item in dollars");
        double currentPrice = sc.nextDouble();
        System.out.println("Enter the inflation rate in percents");
        double inflation = (sc.nextDouble()) / 100;
        System.out.println("Enter the number of from now that the item will be purchased");
        int numOfYears = sc.nextInt();
        double finalPrice = currentPrice;
        for(int i = 0; i < numOfYears; i++){
            finalPrice = finalPrice * (1 + inflation);
        }
        String result = df.format(finalPrice);
        System.out.println("The estimated cost in " + numOfYears + " is " + result);
    }
}
