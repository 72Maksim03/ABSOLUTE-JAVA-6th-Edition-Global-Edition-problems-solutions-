/**
 * Create a class named Pizza that stores information about a single pizza. It should
 * contain the following:
 * • Private instance variables to store the size of the pizza (either small, medium,
 * or large), the number of cheese toppings, the number of pepperoni toppings,
 * and the number of ham toppings.
 * • Constructor(s) that set all of the instance variables.
 * • Public methods to get and set the instance variables.
 * • A public method named calcCost( ) that returns a double that is the cost
 * of the pizza.
 *  Pizza cost is determined by:
 *  Small: $10 + $2 per topping
 *  Medium: $12 + $2 per topping
 *  Large: $14 + $2 per topping
 * • A public method named getDescription( ) that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated
 * by calcCost( ).
 *  Write test code to create several pizzas and output their descriptions. For
 * example, a large pizza with one cheese, one pepperoni and two ham toppings
 * should cost a total of $22.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for your pizza (small, medium, large)");
        String size = sc.next();
        System.out.println("Enter the number of cheese toppings");
        int cheeseToppings = sc.nextInt();
        System.out.println("Enter the number of pepperoni toppings");
        int pepperoniToppings = sc.nextInt();
        System.out.println("Enter the number of ham toppings");
        int hamToopings = sc.nextInt();
        Pizza p1 = new Pizza(size, cheeseToppings, pepperoniToppings, hamToopings);
        System.out.println(p1.getDescription());
    }
}
