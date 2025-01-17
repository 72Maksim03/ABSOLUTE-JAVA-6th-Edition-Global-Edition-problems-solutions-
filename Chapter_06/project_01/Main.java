/**
 * You are running a courier agency. The weight of a parcel determines the number
 * of stamps that will be needed to send that parcel. For each kilogram, a stamp of
 * $2 is needed. Create a class to accept the weight of five parcels in floating-point
 * values. Also, the courier company charges an additional rate depending on where
 * the courier has to be delivered. The charges are $20 for delivery within the city
 * of posting, and $40 for delivery anywhere else in the country. Write a computer
 * program to calculate and display the total cost of each parcel depending on the
 * weight and delivery location of the parcel.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        double[] weights = {10.6, 2.7, 3.0, 2.0, 1.8};
        String[] destinations = {"city", "country", "city", "country", "city"};
        Agency agency = new Agency(weights, destinations);

        System.out.println("Cost of delivery 2: $" + agency.costOfOneParcel(1));
        System.out.println("Cost of all deliveries: $" + agency.totalCost());
    }
}
