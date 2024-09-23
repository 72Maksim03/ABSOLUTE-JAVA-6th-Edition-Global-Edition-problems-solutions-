/**
 * The Pizza class represents a pizza with customizable size and toppings.
 * It calculates the cost of the pizza based on the size and number of toppings.
 *
 * @author Maksim Petrosyan
 */
public class Pizza {
    private String size;
    private int numOfCheeseToppings;
    private int numOfPepperoniToppings;
    private int numOfHamToppings;
    /**
     * Constructs a pizza object with specified size and number of toppings
     *
     * @param size The size of pizza (small, medium, big)
     * @param numOfCheeseToppings number of cheese toppings
     * @param numOfPepperoniToppings number of pepperoni toppings
     * @param numOfHamToppings number of ham toppings
     * */
    public Pizza(String size, int numOfCheeseToppings, int numOfPepperoniToppings, int numOfHamToppings) {
        this.setSize(size);
        this.setNumOfCheeseToppings(numOfCheeseToppings);
        this.setNumOfPepperoniToppings(numOfPepperoniToppings);
        this.setNumOfHamToppings(numOfHamToppings);
    }

    /**
     * Copy constructor that creates a new Pizza object by copying another one
     *
     * @param pizza The Pizza object to copy.
     * */
    public Pizza(Pizza pizza){
        this(pizza.getSize(), pizza.getNumOfCheeseToppings(), pizza.getNumOfPepperoniToppings(),
                pizza.getNumOfHamToppings());
    }

    /**
     * Constructs a pizza object with specified size and no toppings
     *
     * @param size The size of pizza (small, medium, big)
     * */
    public Pizza(String size){
        this(size, 0, 0, 0);
    }

    /**
     * Gets the size of pizza
     *
     * @return The size of the pizza
     * */
    public String getSize(){
        return this.size;
    }

    /**
     * Sets the size of pizza
     * The size must be "small", "medium" or "big"
     *
     * @param size The size of the pizza
     * */
    public void setSize(String size){
        if(!(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large"))){
            System.out.println("Please enter small, medium or large for pizza size");
            System.exit(0);
        }
        this.size = size;
    }

    /**
     * Gets the number of cheese toppings
     *
     * @return The number of cheese toppings
     * */
    public int getNumOfCheeseToppings(){
        return this.numOfCheeseToppings;
    }

    /**
     * Sets the number of cheese toppings
     * number should be non-negative
     * */
    public void setNumOfCheeseToppings(int numOfCheeseToppings){
        if(numOfCheeseToppings >= 0){
            this.numOfCheeseToppings = numOfCheeseToppings;
        } else{
            System.out.println("Number of cheese toppings must be non-negative");
            System.exit(0);
        }
    }

    /**
     * Gets the number of pepperoni toppings
     *
     * @return The number of pepperoni toppings
     * */
    public int getNumOfPepperoniToppings(){
        return this.numOfPepperoniToppings;
    }

    /**
     * Sets the number of pepperoni toppings
     * The number should be non-negative
     *
     * @param numOfPepperoniToppings The number of pepperoni toppings
     * */
    public void setNumOfPepperoniToppings(int numOfPepperoniToppings){
        if(numOfPepperoniToppings >= 0){
            this.numOfPepperoniToppings = numOfPepperoniToppings;
        } else{
            System.out.println("Number of pepperoni toppings must be non-negative");
            System.exit(0);
        }
    }

    /**
     * Gets the number of ham toppings
     *
     * @return The number of ham toppings
     * */
    public int getNumOfHamToppings(){
        return this.numOfHamToppings;
    }

    /**
     * Sets the number of ham toppings
     * number should be non-negative
     *
     * @param numOfHamToppings The number of ham toppings
     * */
    public void setNumOfHamToppings(int numOfHamToppings){
        if(numOfHamToppings >= 0){
            this.numOfHamToppings = numOfHamToppings;
        } else{
            System.out.println("Number of ham toppings must be non-negative");
            System.exit(0);
        }
    }

    /**
     * Calculates the total cost of the pizza based on its size and toppings
     *
     * @return The total cost of the pizza
     * */
    public double calcCost(){
        double cost = 0.0;
        switch(this.size){
            case "small":
                cost = 10.0;
                break;
            case "medium":
                cost = 12.0;
                break;
            case "large":
                cost = 14.0;
                break;
        }
        cost += (this.numOfCheeseToppings * 2) +
                (this.numOfPepperoniToppings * 2) +
                (this.numOfHamToppings * 2);
        return cost;
    }

    /**
     * Provides a description of the pizza including its size, number of toppings, and cost.
     *
     * @return The string describing the pizza
     * */
    public String getDescription(){
        return "Size: " + this.size +
                "\nNumber of cheese toppings: " + this.numOfCheeseToppings +
                "\nNumber of pepperoni toppings: " + this.numOfPepperoniToppings +
                "\nNumber of ham toppings: " + this.numOfHamToppings +
                "\nCost: " + this.calcCost();
    }
}