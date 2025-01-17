/**
 * . The goal of this Programming Project is to extend Programming Project 14 to find
 * the customer from the CSV file who made ratings that are most similar to ratings
 * input from the keyboard. First, do Programming Project 14. Then modify your
 * solution so that it asks the user to input ratings for the first four products before
 * the program reads from the file. The program should then predict whether or
 * not the user will like the final product by outputting the rating made by the most
 * similar customer. Use the formula | Au – Ac| + | Bu – Bc| + | Cu – Cc| + | Du – Dc|
 * to compute the similarity, where Au is the rating for product A made by the user
 * at the keyboard and Ac is the rating for product A made by a customer from the
 * file. A lower total indicates greater similarity. For example, if the user inputs 1 for
 * product A, 1 for product B, 3 for product C, and 2 for product D, then with the
 * values from Programming Project 14, the similarity to the customer in the first row
 * is |1 – 3| + |1 – 0| + |3 – 5| + |2 – 1| = 6, while the similarity to the customer in the
 * second row is |1 – 1| + |1 – 1| + |3 – 4| + |2 – 2| = 1. The customer in the second
 * row has the greatest similarity, so the program would output that the prediction
 * for product E is 1, which is the second customer’s rating for product E.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args){
        Scanner sc = null;
        Scanner kb = new Scanner(System.in);
        try{
            sc = new Scanner(new FileInputStream("ratings.txt"));
        } catch(Exception FileNotFoundException){
            System.out.println("File not found");
            System.exit(0);
        }
        String products = sc.nextLine();
        String[] productList = products.split(",");
        int[] lastProductRatings = new int[getNumberOfLines("ratings.txt") - 1];
        int[] similarities = new int[getNumberOfLines("ratings.txt") - 1];
        int[] userRatings = new int[productList.length - 1];
        for(int i = 0; i < userRatings.length; i++){
            System.out.println("Enter your rating for product " + productList[i]);
            userRatings[i] = kb.nextInt();
        }
        int index = 0;
        while(sc.hasNextLine()){
            int similarity = 0;
            String ratingLine = sc.nextLine();
            String[] ratings = ratingLine.split(",");
            for(int i = 0; i < ratings.length - 1; i++){
                int rate = Integer.parseInt(ratings[i]);
                if(rate > userRatings[i]){
                    similarity += (rate - userRatings[i]);
                } else{
                    similarity += (userRatings[i] - rate);
                }
            }
            lastProductRatings[index] = Integer.parseInt(ratings[ratings.length - 1]);
            similarities[index] = similarity;
            index++;
        }
        System.out.println("Most probably your rating for product " + productList[productList.length - 1] +
                ": " + lastProductRatings[getIndexOfMinimum(similarities)]);
    }

    public static int getIndexOfMinimum(int[] arr){
        int min = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int getNumberOfLines(String pathToFile){
        Scanner sc =  null;
        try{
            sc = new Scanner(new FileInputStream(pathToFile));
        } catch(Exception FileNotFoundException){
            System.out.println("File not found");
            System.exit(0);
        }
        int count = 0;
        while(sc.hasNextLine()){
            sc.nextLine();
            count++;
        }
        return count;
    }
}