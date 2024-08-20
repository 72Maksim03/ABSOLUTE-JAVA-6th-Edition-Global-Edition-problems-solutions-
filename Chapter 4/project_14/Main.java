/**
 * A comma-separated values (CSV) file is a simple text format used to store a list of
 * records. A comma is used as a delimiter to separate the fields for each record. This
 * format is commonly used to transfer data between a spreadsheet or database. In
 * this Programming Project, consider a store that sells five products abbreviated as
 * A, B, C, D, and E. Customers can rate each product from 1–5, where 1 is poor
 * and 5 is excellent. The ratings are stored in a CSV file where each row contains
 * the customer’s rating for each product. Here is a sample file with three customer
 * ratings:
 * A,B,C,D,E
 * 3,0,5,1,2
 * 1,1,4,2,1
 * 0,0,5,1,3
 *  In this file format, the first line gives the products. The digit 0 indicates that a
 * customer did not rate a product. In this case, the first customer rated A as 3, C as
 * 5, D as 1, and E as 2. Product B was not rated. The third customer rated C as 5,
 * D as 1, and E as 3. The third customer did not rate A or B.
 *  Create a text file in this format with sample ratings. Then, write a program that
 * reads in this text file and extracts each rating using the StringTokenizer class.
 * Finally, the program should output the average rating for each product. Customers
 * that did not rate a product should not be considered when computing the average
 * rating for that product. Your program can assume there will always be exactly five
 * products but it should work with an arbitrary number of customer ratings.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new FileInputStream("ratings.txt"));
        } catch(Exception FileNotFoundException){
            System.out.println("File not found");
            System.exit(0);
        }
        DecimalFormat df = new DecimalFormat(".##");
        String products = sc.nextLine();
        String[] productList = products.split(",");
        int[] productRatings = new int[productList.length];
        int[] productCounts = new int[productList.length];
        while(sc.hasNextLine()){
            String ratingLine = sc.nextLine();
            String[] ratings = ratingLine.split(",");
            for(int i = 0; i < ratings.length; i++){
                int rate = Integer.parseInt(ratings[i]);
                if(rate != 0){
                    productRatings[i] += rate;
                    productCounts[i]++;
                }
            }
        }
        double[] averageRatings = new double[productList.length];
        for(int i = 0; i < productRatings.length; i++){
            if(productCounts[i]!= 0){
                averageRatings[i] = (double)productRatings[i] / productCounts[i];
            } else{
                averageRatings[i] = 0;
            }
            System.out.println("Average rating for product " + productList[i] + ": " +
                    df.format(averageRatings[i]));
        }
    }
}
