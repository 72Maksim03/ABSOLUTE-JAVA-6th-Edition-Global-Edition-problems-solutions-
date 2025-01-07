public class Sale {
    private String name;
    private double price;

    public Sale(String name, double price){
        setName(name);
        setPrice(price);
    }
    public Sale(){this("No name yet", 0.0);}
    public Sale(Sale original){
        setName(original.getName());
        setPrice(original.getPrice());
    }

    public void setPrice(double newPrice){
        if (newPrice >= 0) price = newPrice;
        else{
            System.out.println("Invalid price");
            System.exit(0);
        }
    }
    public void setName(String newName){
        if (newName != null && !newName.isEmpty()) name = newName;
        else{
            System.out.println("Invalid name");
            System.exit(0);
        }
    }
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}

    public static void announcement(){System.out.println("This is the Sale class.");}

    public String toString(){return (name + " Price and total cost = $" + price);}
    public double bill(){return price;}
    
    public boolean equalDeals(Sale other){
        if (other == null) return false;
        return (name.equals(other.getName()) && bill() == other.bill());
    }

    public boolean lessThan(Sale other){
        if (other == null){
            System.out.println("Error: null Sale object");
            System.exit(0);
        }
        return bill() < other.bill();
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Sale otherSale = (Sale) other;
        return otherSale.getName().equals(getName()) && otherSale.getPrice() == getPrice();
    }
}
