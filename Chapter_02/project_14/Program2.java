/**
 * From Programming Project 10 in Chapter 1, scientists estimate that roughly 10
 * grams of caffeine consumed at one time is a lethal overdose. Write two programs
 * to compute how many drinks it takes to kill a person.
 * The first program should input the name of the drink and the number of
 * milligrams of caffeine in the drink. It should then output the drink name and the
 * number of drinks it takes to kill a person. For example, if the user enters “coffee”
 * and “160”, then the program should output “It will take approximately 62.5
 * drinks of coffee to kill a person from caffeine.”
 * The second program should perform the same calculation as the first program,
 * but read the name of the drink and the number of milligrams of caffeine in the
 * drink from a file named drink.txt and output the answer to the console.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
public class Program2 {
    public static int lethalDoseInGrams = 10;
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new FileInputStream("drink.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        String drinkName = sc.nextLine();
        double gramsOfCaffeine = sc.nextDouble() / 1000;
        double numberOfDrinks = lethalDoseInGrams / gramsOfCaffeine;
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("It will take approximately " + df.format(numberOfDrinks) +
                " drinks of " + drinkName + " to kill a person from caffeine.");
    }
}
