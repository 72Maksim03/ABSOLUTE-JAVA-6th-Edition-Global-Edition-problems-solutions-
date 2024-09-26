/**
 * First, complete Programming Project 4.13 from Chapter 4.
 *  Modify the main method with a loop so that an arbitrary number of BoxOfProduce
 * objects are created and substitutions are allowed for each box. Add a menu so the
 * user can decide when to stop creating boxes.
 *  You would like to throw in a free recipe flyer for salsa verde if the box contains
 * tomatillos. However, there are only five recipe flyers. Add a static variable to the
 * BoxOfProduce class that counts the number of recipe flyers remaining and initialize
 * it to 5. Also add an instance variable that indicates whether or not the box contains
 * a recipe flyer and modify the toString() method to also output “salsa verde
 * recipe” if the box contains a recipe flyer. Finally, add logic inside the class so that
 * if the box contains at least one order of tomatillos then it automatically gets a recipe
 * flyer until all of the recipe flyers are gone. Note that a box should only get one recipe
 * flyer even if there are multiple orders of tomatillos.
 *  Test your class by creating boxes with tomatillos from your menu until all of the
 * flyers are gone.
 *
 * @Author Maksim Petrosyan
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

        char newBox = 'y';
        int boxes = 1;
        while(newBox == 'y'){
            BoxOfProducts box1 = new BoxOfProducts();

            String product1 = getRandomFromList(productList);
            String product2 = getRandomFromList(productList);
            String product3 = getRandomFromList(productList);
            box1.setProduct1(product1);
            box1.setProduct2(product2);
            box1.setProduct3(product3);

            System.out.println(boxes + ". " + box1);
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

            System.out.println("Do you want to create another box? yes[y]/no[n]");
            newBox = kb.next().charAt(0);
            boxes++;
        }

    }

    /**
     * Gives random element from array
     *
     * @param arr Array of strings to choose a random element from
     * @return a randomly selected element
     * */
    public static String getRandomFromList(String[] arr){
        int randomIndex = (int)(Math.random() * arr.length);
        return arr[randomIndex];
    }
}