public class Vehicle {
    private String manufacturer;
    private int cylinders;
    private Person owner;

    public Vehicle(String manufacturer, int cylinders, Person owner){
        this.manufacturer = manufacturer;
        this.cylinders = cylinders;
        this.owner = owner;
    }
    public Vehicle(){this("No manufacturer", 0, new Person());}
    public Vehicle(Vehicle other){this(other.manufacturer, other.cylinders, other.owner);}

    public String getManufacturer(){return manufacturer;}
    public int getCylinders(){return cylinders;}
    public Person getOwner(){return new Person(owner);}

    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}
    public void setCylinders(int cylinders){this.cylinders = cylinders;}
    public void setOwner(Person owner){this.owner = owner;}

    public String toString(){
        return "Manufacturer: " + manufacturer + "\nCylinders: " + cylinders + "\nOwner: " + owner;
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Vehicle otherVehicle = (Vehicle) other;
        return manufacturer.equals(otherVehicle.getManufacturer())
                && cylinders == otherVehicle.getCylinders()
                && owner.equals(otherVehicle.getOwner());
    }
}
