public class PizzaOrder {
    private Pizza[] pizza;
    public PizzaOrder(int numPizzas) {
        this.setNumPizzas(numPizzas);
    }

    public PizzaOrder(){}

    public void setNumPizzas(int numPizzas){
        this.pizza = new Pizza[numPizzas];
    }

    public void setPizza(int i, Pizza pizza){
        if(pizza == null) return;
        this.pizza[i-1] = new Pizza(pizza.getSize(), pizza.getNumOfPepperoniToppings(), pizza.getNumOfHamToppings(), pizza.getNumOfCheeseToppings());
    }

    public double calcTotalCost(){
        double totalCost = 0.0;
        for (int i = 0; i < pizza.length; i++) totalCost += pizza[i].calcCost();
        return totalCost;
    }
}