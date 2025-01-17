/**
 * The PizzaOrder class represents an order of up to three pizzas.
 * It allows setting individual pizzas in the order and calculating the total cost.
 */
public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private int numPizzas;
    /**
     * Constructs PizzaOrder class with specified pizzas and the number of pizzas in the order
     *
     * @param pizza1 The first pizza in the order
     * @param pizza2 The second pizza in the order
     * @param pizza3 The third pizza in the order
     * @param numPizzas The number of pizzas in the order (between 1 and 3)
     * */
    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3, int numPizzas) {
        this.setPizza1(pizza1);
        this.setPizza2(pizza2);
        this.setPizza3(pizza3);
        this.setNumPizzas(numPizzas);
    }

    /**
     * Constructs an empty PizzaOrder with no pizzas
     * */
    public PizzaOrder(){
        this(null, null, null, 0);
    }

    /**
     * Constructs a PizzaOrder with one pizza
     *
     * @param pizza1 The first pizza in the order
     * */
    public PizzaOrder(Pizza pizza1){
        this(pizza1, null, null, 1);
    }

    /**
     * Constructs a PizzaOrder with two pizzas
     *
     * @param pizza1 The first pizza in the order
     * @param pizza2 The second pizza in the order
     * */
    public PizzaOrder(Pizza pizza1, Pizza pizza2){
        this(pizza1, pizza2, null, 2);
    }

    /**
     * Constructs a PizzaOrder with three pizzas
     *
     * @param pizza1 The first pizza in the order
     * @param pizza2 The second pizza in the order
     * @param pizza3 The third pizza in the order
     * */
    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3){
        this(pizza1, pizza2, pizza3, 3);
    }

    /**
     * Copy constructor that creates a new PizzaOrder object by copying another one
     *
     * @param order The object to copy
     * */
    public PizzaOrder(PizzaOrder order){
        this(order.getPizza1(), order.getPizza2(), order.getPizza3(), order.getNumPizzas());
    }

    /**
     * Gets the number of pizzas in the order
     *
     * @return The number of pizzas in the order
     * */
    public int getNumPizzas(){
        return this.numPizzas;
    }

    /**
     * Gets the first pizza in the order
     *
     * @return The first pizza in the order
     * */
    public Pizza getPizza1(){
        return this.pizza1;
    }

    /**
     * Gets the second pizza in the order
     *
     * @return The second pizza in the order
     * */
    public Pizza getPizza2(){
        return this.pizza2;
    }

    /**
     * Gets the third pizza in the order
     *
     * @return The third pizza in the order
     * */
    public Pizza getPizza3(){
        return this.pizza3;
    }

    /**
     * Sets the number of pizzas in order
     * Number should be between 1 and 3
     *
     * @param numPizzas The number of pizzas
     * */
    public void setNumPizzas(int numPizzas){
        if(numPizzas < 0 || numPizzas > 3){
            System.out.println("Please enter a number between 1 and 3");
            System.exit(0);
        }
        this.numPizzas = numPizzas;
    }

    /**
     * Sets the first pizza in the order by creating a copy of the provided Pizza object.
     *
     * @param pizza The Pizza object to set as the first pizza
     * */
    public void setPizza1(Pizza pizza){
        if(pizza == null){
            pizza1 = null;
            return;
        }
        this.pizza1 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    /**
     * Sets the second pizza in the order by creating a copy of the provided Pizza object
     *
     * @param pizza The Pizza object to set as the second pizza
     * */
    public void setPizza2(Pizza pizza){
        if(pizza == null){
            pizza2 = null;
            return;
        }
        this.pizza2 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    /**
     * Sets the third pizza in the order by creating a copy of the provided Pizza object
     *
     * @param pizza The Pizza object to set as the third pizza
     * */
    public void setPizza3(Pizza pizza){
        if(pizza == null){
            pizza3 = null;
            return;
        }
        this.pizza3 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    /**
     * Calculates the total cost of all pizzas in the order.
     *
     * @return The total cost of the pizzas in the order.
     */
    public double calcTotalCost(){
        double totalCost = 0.0;
        if(pizza1 != null) totalCost += pizza1.calcCost();
        if(pizza2 != null) totalCost += pizza2.calcCost();
        if(pizza3 != null) totalCost += pizza3.calcCost();
        return totalCost;
    }
}