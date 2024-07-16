/**
 * The following program will compile and run, but it uses poor programming style.
 * Modify the program so that it uses the spelling conventions, constant naming
 * conventions, and formatting style recommended in this book.
 *  public class vehicleAvgSpeed {
 *  public static void main(String[] args)
 *  {
 *  double TIME;
 *  System.out.println("This program calculates vehicle average speed
 * given a time and distance traveled.");
 *  TIME = 20.5;
 *  AVERAGE_SPEED = distance / TIME;
 *  System.out.println("Car average speed is " + AVERAGE_SPEED
 * + " miles per hour.");
 *  }
 *  public static final double distance = 180;
 *  }
 * */
public class vehicleAvgSpeed {
    public static final double distance = 180;
    public static void main(String[] args) {
        double time = 20.5;
        System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
        double averageSpeed = distance / time;
        System.out.println("Car average speed is " + averageSpeed + " miles per hour.");
    }
}
