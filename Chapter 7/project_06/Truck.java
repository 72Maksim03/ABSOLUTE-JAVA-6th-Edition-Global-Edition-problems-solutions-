public class Truck extends Vehicle{
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturer, int cylinders, Person owner, double loadCapacity, int towingCapacity){
        super(manufacturer, cylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public Truck(){
        super();
        this.loadCapacity = 0.0;
        this.towingCapacity = 0;
    }
    public Truck(Truck other){
        super(other);
        this.loadCapacity = other.loadCapacity;
        this.towingCapacity = other.towingCapacity;
    }

    public double getLoadCapacity(){return loadCapacity;}
    public int getTowingCapacity(){return towingCapacity;}
    public void setLoadCapacity(double loadCapacity){this.loadCapacity = loadCapacity;}
    public void setTowingCapacity(int towingCapacity){this.towingCapacity = towingCapacity;}

    public String toString(){
        return "Truck: " + super.toString() + "\nLoad Capacity: " + loadCapacity + "\nTowing Capacity: " + towingCapacity;
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Truck otherTruck = (Truck) other;
        return otherTruck.getManufacturer().equals(getManufacturer())
                && otherTruck.getCylinders() == getCylinders()
                && otherTruck.getOwner().equals(getOwner())
                && otherTruck.getLoadCapacity() == getLoadCapacity()
                && otherTruck.getTowingCapacity() == getTowingCapacity();
    }
}
