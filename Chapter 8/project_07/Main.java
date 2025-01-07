/**
 * Define a class named MultiItemSale that represents a sale of multiple items of
 * type Sale given in Display 8.1 (or of the types of any of its descendent classes).
 * The class MultiItemSale will have an instance variable whose type is Sale[],
 * which will be used as a partially filled array. There will also be another instance
 * variable of type int that keeps track of how much of this array is currently used.
 * The exact details on methods and other instance variables, if any, are up to you.
 * Use this class in a program that obtains information for items of type Sale and of
 * type DiscountSale (Display 8.2) and that computes the total bill for the list of
 * items sold
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        MultiItemSale sales = new MultiItemSale();
        sales.addSale("Shirt", 15.99);
        sales.addSale("Pants", 25.99, 10);
        sales.addSale("Shirt", 20, 15);
        sales.addSale("Pants", 18);

        System.out.println("Total sales: " + sales.totalBill());
    }
}
