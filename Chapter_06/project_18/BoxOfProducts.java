public class BoxOfProducts {
    private String[] products;

    public BoxOfProducts(int numOfProducts) {
        this.products = new String[numOfProducts];
    }

    public BoxOfProducts(){this(3);}

    public void setProduct(int i, String product){this.products[i-1] = product;}

    public String getProduct(int i){return this.products[i];}

    public int getNumOfProducts(){return products.length;}

    public String toString(){
        String box = "The content of the box:";
        for (int i = 0; i < products.length; i++) box += "\n" + (i + 1) + ". " + products[i];
        return box;
    }
}
