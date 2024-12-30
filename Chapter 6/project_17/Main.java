import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Programming Project 4.14 asked you to read in a CSV file of product ratings. The
 * file was limited to exactly five products. Redo Programming Project 4.14, except
 * calculate the name of each product and how many products are in the file based
 * on the header line. Then read the CSV file and translate the data into a 2D array
 * that stores all of the ratings. Finally, output the average rating for each product.
 *
 * Թauthor Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("Ratings.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }

        String[] products = sc.nextLine().split(",");
        int[][] ratings = new int[100][products.length];
        int numOfRatings = 0;
        while(sc.hasNext()){
            String[] row = sc.nextLine().split(",");
            for(int i = 0; i < row.length; i++){
                ratings[numOfRatings][i] = Integer.parseInt(row[i]);
            }
            numOfRatings++;
        }

        double[] averages = new double[products.length];
        for(int i = 0; i < products.length; i++){
            double sum = 0.0;
            for (int j = 0; j < numOfRatings; j++) sum += ratings[j][i];
            averages[i] = sum / numOfRatings;
        }

        for (int i = 0; i < products.length; i++)
            System.out.println("Average rating for product " + products[i] + ": " + averages[i]);
    }
}
