public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private int numPizzas;
    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3, int numPizzas) {
        this.setPizza1(pizza1);
        this.setPizza2(pizza2);
        this.setPizza3(pizza3);
        this.setNumPizzas(numPizzas);
    }

    public PizzaOrder(){
        this(null, null, null, 0);
    }

    public PizzaOrder(Pizza pizza1){
        this(pizza1, null, null, 1);
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2){
        this(pizza1, pizza2, null, 2);
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3){
        this(pizza1, pizza2, pizza3, 3);
    }

    public void setNumPizzas(int numPizzas){
        if(numPizzas < 0 || numPizzas > 3){
            System.out.println("Please enter a number between 1 and 3");
            System.exit(0);
        }
        this.numPizzas = numPizzas;
    }

    public void setPizza1(Pizza pizza){
        if(pizza == null){
            pizza1 = null;
            return;
        }
        this.pizza1 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    public void setPizza2(Pizza pizza){
        if(pizza == null){
            pizza2 = null;
            return;
        }
        this.pizza2 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    public void setPizza3(Pizza pizza){
        if(pizza == null){
            pizza3 = null;
            return;
        }
        this.pizza3 = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    public double calcTotalCost(){
        double totalCost = 0.0;
        if(pizza1 != null) totalCost += pizza1.calcCost();
        if(pizza2 != null) totalCost += pizza2.calcCost();
        if(pizza3 != null) totalCost += pizza3.calcCost();
        return totalCost;
    }
}
