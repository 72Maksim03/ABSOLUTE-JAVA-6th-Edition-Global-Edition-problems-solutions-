import java.text.DecimalFormat;
public class Vehicle {
    private final double tankSize;
    private double efficiency;
    private double fuelInTank = 0;

    public Vehicle(double tankSize, double efficiency){
        this.efficiency = efficiency;
        this.tankSize = tankSize;
    }

    public Vehicle(double tankSize, double efficiency, double fuelInTank){
        this.efficiency = efficiency;
        this.tankSize = tankSize;
        this.fuelInTank = fuelInTank;
    }

    public double getTankSize(){
        return tankSize;
    }

    public double getEfficiency(){
        return efficiency;
    }

    public double getFuelInTank(){
        return fuelInTank;
    }

    public void addPetrol(double petrolToAdd){
        if(fuelInTank + petrolToAdd > tankSize){
            System.out.println("Cannot add " + petrolToAdd + " liters. Exceeds tank capacity.");
            return;
        }
        fuelInTank += petrolToAdd;
    }

    public String driveTo(){
        DecimalFormat df = new DecimalFormat(".#");
        double distance = fuelInTank / efficiency;
        return df.format(distance);
    }
}
