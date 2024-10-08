/**
 * This programming project extends Programming Project 4.11. Create a PizzaOrder
 * class that allows up to three pizzas to be saved in an order. Each pizza saved should be
 * a Pizza object as described in Programming Project 4.11. In addition to appropriate
 * instance variables and constructors, add the following methods:
 * • public void setNumPizzas(int numPizzas)—sets the number of pizzas
 * in the order. numPizzas must be between 1 and 3.
 * • public void setPizza1(Pizza pizza1)—sets the first pizza in the order.
 * • public void setPizza2(Pizza pizza2)—sets the second pizza in the order.
 * • public void setPizza3(Pizza pizza3)—sets the third pizza in the order.
 * • public double calcTotal()—returns the total cost of the order.
 *  Write a main method to test the class. The setPizza2 and setPizza3 methods
 * will be used only if there are two or three pizzas in the order, respectively. Sample
 * code illustrating the methods is shown below. Note that first three lines are incomplete. You must complete them as part of the Programming Project.
 * Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 * Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
 * PizzaOrder order = // Code to create an order
 * order.setNumPizzas(2); // 2 pizzas in the order
 * order.setPizza1(pizza1); // Set first pizza
 * order.setPizza2(pizza2); // Set second pizza
 * double total = order.calcTotal(); // Should be 18+20 = 38
 *
 * @author Maksim Petrosyan;
 * */
public class Main {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
        Pizza pizza3 = new Pizza("small", 2, 2, 3);
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(1);
        order.setPizza1(pizza1);
        System.out.println("The cost for the first order: " + order.calcTotalCost());
        order.setNumPizzas(2);
        order.setPizza2(pizza2);
        System.out.println("The cost for the second order: " + order.calcTotalCost());
        order.setNumPizzas(3);
        order.setPizza3(pizza3);
        System.out.println("The cost for the third order: " + order.calcTotalCost());
    }
}
