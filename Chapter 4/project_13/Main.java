/**
 * Your Community Supported Agriculture (CSA) farm delivers a box of fresh fruits
 * and vegetables to your house once a week. For this Programming Project, define the
 * class BoxOfProduce that contains exactly three bundles of fruits or vegetables. You
 * can represent the fruits or vegetables as three instance variables of type String. Add
 * appropriate constructor, accessor, and mutator methods. Also write a toString()
 * method that returns as a String the complete contents of the box.
 *  Next, write a main method that creates a BoxOfProduce with three items randomly
 * selected from this list:
 * Broccoli
 * Tomato
 * Kiwi
 * Kale
 * Tomatillo
 *  This list should be stored in a text file that is read in by your program. For now
 * you can assume that the list contains exactly five types of fruits or vegetables.
 *  Do not worry if your program randomly selects duplicate produce for the three
 * items. Next, the main method should display the contents of the box and allow
 * the user to substitute any one of the five possible fruits or vegetables for any of the
 * fruits or vegetables selected for the box. After the user is done with substitutions,
 * output the final contents of the box to be delivered. If you create additional methods to
 * select the random items and to select valid substitutions, then your main
 * method will be simpler to write.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        Scanner kb = new Scanner(System.in);
        try{
            sc = new Scanner(new FileInputStream("data.txt"));
        } catch(Exception FileNotFoundException){
            System.out.println("File not found");
            System.exit(0);
        }
        String[] productList = new String[5];
        for(int i = 0; i < 5; i++){
            productList[i] = sc.nextLine();
        }

        BoxOfProducts box1 = new BoxOfProducts();

        String product1 = getRandomFromList(productList);
        String product2 = getRandomFromList(productList);
        String product3 = getRandomFromList(productList);
        box1.setProduct1(product1);
        box1.setProduct2(product2);
        box1.setProduct3(product3);

        System.out.println(box1);
        System.out.println("Do you want to change any product? yes[y]/no[n]");
        char choice = kb.next().charAt(0);

        while(choice == 'y'){
            System.out.println("Enter the index of product from your box you want to change");
            int indexToChange = kb.nextInt() - 1;
            if(indexToChange < 0 || indexToChange > 2){
                System.out.println("Invalid index. Please enter a number from 1 to 3");
                continue;
            }
            System.out.println("List of available products");
            for(int i = 0; i < productList.length; i++){
                System.out.println((i+1) + ". " + productList[i]);
            }
            System.out.println("Enter the index of product to put in box");
            int indexOfNewProduct = kb.nextInt() - 1;
            if(indexOfNewProduct < 0 || indexOfNewProduct > 4){
                System.out.println("Invalid index. Please enter a number from 1 to 5");
                continue;
            }
            if(indexToChange == 0){
                box1.setProduct1(productList[indexOfNewProduct]);
            } else if(indexToChange == 1){
                box1.setProduct2(productList[indexOfNewProduct]);
            } else if(indexToChange == 2){
                box1.setProduct3(productList[indexOfNewProduct]);
            }
            System.out.println(box1);
            System.out.println("Do you want to make any other change? yes[y]/no[n]");
            choice = kb.next().charAt(0);
        }
        System.out.println(box1);
    }

    public static String getRandomFromList(String[] arr){
        int randomIndex = (int)(Math.random() * arr.length);
        return arr[randomIndex];
    }
}
