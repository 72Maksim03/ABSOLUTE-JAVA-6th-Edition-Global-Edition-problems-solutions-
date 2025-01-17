/**
 * Programming Project 4.12 asked you to create a PizzaOrder class that stores an
 * order consisting of up to three pizzas. Modify the class to store the pizzas using an
 * array. This will allow the class to include an arbitrary number of pizzas in the order
 * instead of a maximum of three. The setNumPizzas method can be used to create
 * an array of the appropriate size. The array structure allows you to eliminate the
 * methods setPizza1, setPizza2, and setPizza3 and replace them with a single
 * method, setPizza(int index, Pizza newPizza). Include appropriate tests to
 * determine if the new PizzaOrder class is working correctly.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        PizzaOrder order1 = new PizzaOrder(3);
        order1.setPizza(1, new Pizza("small", 3, 4, 1));
        order1.setPizza(2, new Pizza("medium", 2, 7, 1));
        order1.setPizza(3, new Pizza("large", 1, 3, 1));

        System.out.println(order1.calcTotalCost());
    }
}
