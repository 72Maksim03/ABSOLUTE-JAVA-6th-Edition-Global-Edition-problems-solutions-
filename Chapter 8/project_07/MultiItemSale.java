public class MultiItemSale {
    private Sale[] sales;
    private int numOfSales = 0;

    public MultiItemSale(int maxNumOfSales){sales = new Sale[maxNumOfSales];}
    public MultiItemSale(){this(16);}
    public MultiItemSale(MultiItemSale other){
        this(other.maxNumOfSales());
        numOfSales = other.numOfSales;
        for (int i = 0; i < numOfSales; i++){
            if (other.sales[i] instanceof DiscountSale)
                sales[i] = new DiscountSale((DiscountSale) other.sales[i]);
            else sales[i] = new Sale(other.sales[i]);
        }
    }

    public int maxNumOfSales(){return sales.length;}
    public void addSale(Sale sale){
        if (numOfSales == sales.length){
            System.out.println("Maximum number of sales. Sale can not be added");
            return;
        }
        sales[numOfSales] = sale;
        numOfSales++;
    }

    public void addSale(String name, double price){
        Sale newSale = new Sale(name, price);
        addSale(newSale);
    }
    public void addSale(String name, double price, double discount){
        Sale newSale = new DiscountSale(name, price, discount);
        addSale(newSale);
    }

    public Sale getSale(int index){
        if (index < 0 || index >= numOfSales)
            return null;
        return sales[index];
    }
    public Sale deleteSale(int index){
        if (index < 0 || index >= numOfSales){
            System.out.println("Invalid index");
            System.exit(0);
        }
        Sale temp = sales[index];
        sales[index] = sales[numOfSales - 1];
        sales[numOfSales - 1] = null;
        numOfSales--;
        return temp;
    }
    public Sale deleteLastSale(){
        if (numOfSales == 0){
            System.out.println("No sales to delete");
            return null;
        }
        Sale temp = sales[numOfSales - 1];
        sales[numOfSales - 1] = null;
        numOfSales--;
        return temp;
    }

    public double totalBill(){
        double total = 0;
        for (int i = 0; i < numOfSales; i++) total += sales[i].bill();
        return total;
    }
}
