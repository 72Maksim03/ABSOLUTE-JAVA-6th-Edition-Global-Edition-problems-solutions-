public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("medium", 5, 2, 1);
        Pizza pizza2 = new Pizza("large", 10, 3, 2);
        Pizza pizza3 = new Pizza("small", 2, 5, 1);

        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(3);
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        order1.setPizza3(pizza3);
        double total1 = order1.calcTotalCost();

        PizzaOrder order2 = new PizzaOrder(order1);
        order2.getPizza2().setNumOfCheeseToppings(0);
        double total2 = order2.calcTotalCost();
        double originalTotal = order1.calcTotalCost();
        System.out.println("Original Total Cost: $" + total1);
        System.out.println("Original Total Cost: $" + originalTotal);
        System.out.println("Total Cost with 0 Cheese Toppings: $" + total2);

    }
}
