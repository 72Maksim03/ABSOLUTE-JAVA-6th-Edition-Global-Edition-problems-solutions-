public class Pizza {
    private String size;
    private int numOfCheeseToppings;
    private int numOfPepperoniToppings;
    private int numOfHamToppings;
    public Pizza(String size, int numOfCheeseToppings, int numOfPepperoniToppings, int numOfHamToppings) {
        this.setSize(size);
        this.setNumOfCheeseToppings(numOfCheeseToppings);
        this.setNumOfPepperoniToppings(numOfPepperoniToppings);
        this.setNumOfHamToppings(numOfHamToppings);
    }

    public Pizza(String size){
        this(size, 0, 0, 0);
    }

    public String getSize(){
        return this.size;
    }

    public void setSize(String size){
        if(!(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large"))){
            System.out.println("Please enter small, medium or large for pizza size");
            System.exit(0);
        }
        this.size = size;
    }

    public int getNumOfCheeseToppings(){
        return this.numOfCheeseToppings;
    }

    public void setNumOfCheeseToppings(int numOfCheeseToppings){
        if(numOfCheeseToppings >= 0){
            this.numOfCheeseToppings = numOfCheeseToppings;
        } else{
            System.out.println("Number of cheese toppings must be non-negative");
            System.exit(0);
        }
    }

    public int getNumOfPepperoniToppings(){
        return this.numOfPepperoniToppings;
    }

    public void setNumOfPepperoniToppings(int numOfPepperoniToppings){
        if(numOfPepperoniToppings >= 0){
            this.numOfPepperoniToppings = numOfPepperoniToppings;
        } else{
            System.out.println("Number of pepperoni toppings must be non-negative");
            System.exit(0);
        }
    }

    public int getNumOfHamToppings(){
        return this.numOfHamToppings;
    }

    public void setNumOfHamToppings(int numOfHamToppings){
        if(numOfHamToppings >= 0){
            this.numOfHamToppings = numOfHamToppings;
        } else{
            System.out.println("Number of ham toppings must be non-negative");
            System.exit(0);
        }
    }

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

    public String getDescription(){
        return "Size: " + this.size +
                "\nNumber of cheese toppings: " + this.numOfCheeseToppings +
                "\nNumber of pepperoni toppings: " + this.numOfPepperoniToppings +
                "\nNumber of ham toppings: " + this.numOfHamToppings +
                "\nCost: " + this.calcCost();
    }
}
