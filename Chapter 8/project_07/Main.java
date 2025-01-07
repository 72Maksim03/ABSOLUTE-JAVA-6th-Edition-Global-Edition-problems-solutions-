public class Main {
    public static void main(String[] args) {
        MultiItemSale sales = new MultiItemSale();
        sales.addSale("Shirt", 15.99);
        sales.addSale("Pants", 25.99, 10);
        sales.addSale("Shirt", 20, 15);
        sales.addSale("Pants", 18);

        System.out.println("Total sales: " + sales.totalBill());
    }
}
