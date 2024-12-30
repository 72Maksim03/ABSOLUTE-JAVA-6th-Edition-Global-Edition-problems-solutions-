import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

        BoxOfProducts box1 = new BoxOfProducts(4);
        for (int i = 1; i <= box1.getNumOfProducts(); i++) box1.setProduct(i, getRandomFromList(products));
        System.out.println(box1);
        System.out.println("Do you want to change any product? yes[y]/no[n]");
        char choice = kb.next().charAt(0);

        while(choice == 'y'){
            System.out.println("Enter the index of the product you want to change");
            int index = kb.nextInt();
            if (index < 1 || index > box1.getNumOfProducts()){
                System.out.println("Please enter number between 1 and " + box1.getNumOfProducts());
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
            box1.setProduct(index, products[indexOfNewProduct]);
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
