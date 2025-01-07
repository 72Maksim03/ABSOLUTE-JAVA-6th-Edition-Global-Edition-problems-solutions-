public class DiscountSale extends Sale{
    private double discount;

    public DiscountSale(String theName, double thePrice, double theDiscount){
        super(theName, thePrice);
        discount = theDiscount;
    }
    public DiscountSale(){
        super();
        discount = 0;
    }
    public DiscountSale(DiscountSale original){
        super(original);
        discount = original.discount;
    }

    public double getDiscount(){return discount;}
    public void setDiscount(double newDiscount){
        if (newDiscount >= 0 && discount <= 100) discount = newDiscount;
        else {
            System.out.println("Discount can not be less than 0 or more than 100. Discount set to 0.");
            discount = 0;
        }
    }

    public double bill(){
        double fraction = discount / 100;
        return (1 - fraction) * getPrice();
    }

    public String toString(){
        return (getName() + " Price = $" + getPrice()
                + " Discount = " + discount + "%\n"
                + " Total cost = $" + bill());
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        DiscountSale otherSale = (DiscountSale) other;
        return (getName().equals(otherSale.getName()) &&
                getPrice() == otherSale.getPrice() &&
                discount == otherSale.discount);
    }
}
