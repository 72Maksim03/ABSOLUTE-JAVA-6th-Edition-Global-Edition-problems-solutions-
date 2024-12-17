public class Agency {
    private double[] weights;
    private String[] destinations;
    public static final String HOMETOWN = "city";

    /**
     * Constructs and Agency object with specified weights and destinations
     * @param weights an array of weights of parcels
     * @param dest an array of destinations
     * */
    public Agency(double[] weights, String[] dest){
        if (weights.length != 5 || dest.length != 5){
            System.out.println("5 parcels and 5 destinations are needed");
            System.exit(0);
        }
        this.weights = weights;
        this.destinations = dest;
    }

    /**
     * Calculates the cost of delivery of specified parcel based on its weight and destination
     * @param i the index of parcel in arrays
     * @return the cost of delivery
     * */
    public double costOfOneParcel(int i){
        if (i < 0 || i >= weights.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        double cost = (destinations[i].toLowerCase().equals(HOMETOWN)) ? 20.0 : 40.0;
        cost += weights[i] * 2;
        return cost;
    }

    /**
     * Calculates the total cost of delivering all parcels
     *
     * @return the total cost of delivering all parcels
     * */
    public double totalCost(){
        double cost = 0;
        for (int i = 0; i < weights.length; i++) cost += costOfOneParcel(i);
        return cost;
    }
}
