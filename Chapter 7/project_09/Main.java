import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Programming Project 6.18 asked you to use an array of Strings to store the fruits
 * and vegetables shipped in a BoxOfProduce object for a CSA farm.
 *  Modify your solution further by creating a Produce class. This class should have an
 * instance variable of type String for the name, appropriate constructors, and a public
 * toString() method. Then create a Fruit and a Vegetable class that are derived
 * from Produce. These classes should have constructors that take the name as a String
 * and invoke the appropriate constructor from the base class to set the name.
 *  Next, modify the text file of produce so it indicates whether each item is a fruit or
 * a vegetable. Here is one possible organization, although you can use others:
 * Broccoli,Vegetable
 * Tomato,Fruit
 * Kiwi,Fruit
 * Kale,Vegetable
 * Tomatillo,Fruit
 *  Finally, modify the BoxOfProduce class so it creates an array of type Produce
 * instead of type String. The class should read the produce from the text file and
 * create instances of either Fruit or Vegetable, with the appropriate name, in the
 * array. After a box is finished, loop through the contents of the array and output
 * how many fruit and how many vegetables are in the box. The rest of the program
 * should behave the same as the solution to Programming Project 6.18.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        Scanner kb = new Scanner(System.in);
        try{
            sc = new Scanner(new File("data.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        String[] products = new String[5];
        for (int i = 0; i < products.length; i++) products[i] = sc.nextLine();

        BoxOfProduce box1 = new BoxOfProduce();
        fillBoxRandomly(box1, products);
        System.out.println(box1);
        System.out.println("Do you want to change something? yes[y]/no[n]");
        char choice = kb.next().charAt(0);

        while (choice == 'y') {
            System.out.println("Enter the index of the product you want to change");
            int index = kb.nextInt();
            if (index < 1 || index > box1.getCapacity()){
                System.out.println("Please enter number between 1 and " + box1.getCapacity());
                continue;
            }

            System.out.println("Available products");
            for (int i = 0; i < products.length; i++) System.out.println(i + 1 + ". " + products[i]);

            System.out.println("Enter the index of product to put in box");
            int indexOfNewProduct = kb.nextInt() - 1;
            if (indexOfNewProduct < 0 || indexOfNewProduct >= products.length){
                System.out.println("Please enter number between 1 and " + products.length);
                continue;
            }
            box1.setProduct(products[indexOfNewProduct], index-1);
            System.out.println(box1);
            System.out.println("Do you want to make any other change? yes[y]/no[n]");
            choice = kb.next().charAt(0);
        }
    }

    public static void fillBoxRandomly(BoxOfProduce box, String[] products){
        for (int i = 0; i < box.getCapacity(); i++){
            int random = (int) (Math.random() * products.length);
            box.setProduct(products[random], i);
        }
    }
}
