/**
 * Write a program that inputs the name, quantity, and price of three items. The
 * name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
 * be output to two decimal places. The bill should be formatted in columns with
 * 30 characters for the name, 10 characters for the quantity, 10 characters for the
 * price, and 10 characters for the total. Sample input and output are shown as follows:
 *Input name of item 1:
 *  lollipops
 *  Input quantity of item 1:
 *  10
 *  Input price of item 1:
 *  0.50
 *  Input name of item 2:
 *  diet soda
 *  Input quantity of item 2:
 *  3
 *  Input price of item 2:
 *  1.25
 *  Input name of item 3:
 *  chocolate bar
 *  Input quantity of item 3:
 *  20
 *  Input price of item 3:
 *  0.75
 *  Your bill:
 *  Item Quantity Price Total
 * lollipops 10 0.50 5.00
 * diet soda 3 1.25 3.75
 * chocolate bar 20 0.75 15.00
 * Subtotal 23.75
 * 6.25% sales tax 1.48
 * Total 25.23
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0;
        String[] items = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Input name of item " + (i + 1) + ":");
            items[i] = sc.nextLine();
            System.out.println("Input quantity of item " + (i + 1) + ":");
            quantities[i] = sc.nextInt();
            System.out.println("Input price of item " + (i + 1) + ":");
            prices[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Your bill:");
        System.out.printf("%-30s %-10s %-10s %10s%n", "Item", "Quantity", "Price", "Total");
        for(int i = 0; i < 3; i++){
            double totalForItem = quantities[i] * prices[i];
            totalPrice += totalForItem;
            System.out.printf("%-30s %-10s %-10.2f %10.2f%n", items[i], quantities[i], prices[i], totalForItem);
        }
        System.out.printf("%-50s %10.2f%n", "Subtotal", totalPrice);
        double salesTax = totalPrice * 6.25 / 100;
        System.out.printf("%-50s %10.2f%n", "6.25% sales tax", salesTax);
        double total = totalPrice + salesTax;
        System.out.printf("%-50s %10.2f%n", "Total", total);
    }
}
