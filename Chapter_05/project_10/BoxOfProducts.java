/**
 * The BoxOfProducts class represents a box that contains three products
 * with the possibility of including salsa verde if certain conditions are met.
 */
public class BoxOfProducts {
    private String product1;
    private String product2;
    private String product3;
    private static int numOfSalsa = 5;

    /**
     * Constructs a BoxOfProducts with specified products
     * 
     * @param product1 the first product
     * @param product2 the second product
     * @param product3 the third product
     * */
    public BoxOfProducts(String product1, String product2, String product3) {
        this.setProducts(product1, product2, product3);
    }

    /**
     * Constructs a BoxOfProducts with default values
     * All values are defined as not chosed yet
     * */
    public BoxOfProducts(){
        this.setProducts("not chosed yet", "not chosed yet", "not chosed yet");
    }

    /**
     * Sets all three products in the box
     *
     * @param product1 The first product
     * @param product2 The second product
     * @param product3 The third product
     * */
    public void setProducts(String product1, String product2, String product3) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }

    /**
     * Sets tje first product in the box
     *
     * @param product1 The first produc
     * */
    public void setProduct1(String product1){
        this.product1 = product1;
    }

    /**
     * Sets the second product in the box
     *
     * @param product2 The second product
     * */
    public void setProduct2(String product2){
        this.product2 = product2;
    }

    /**
     * Sets the third product in the box
     *
     * @param product3 The third product
     * */
    public void setProduct3(String product3){
        this.product3 = product3;
    }

    /**
     * Gets the first product in the box
     *
     * @return The first product in the box
     * */
    public String getProduct1(){
        return this.product1;
    }

    /**
     * Gets the second product in the box
     *
     * @return The second product in the box
     * */
    public String getProduct2(){
        return this.product2;
    }

    /**
     * Gets the third product in the box
     *
     * @return The third product in th box
     * */
    public String getProduct3(){
        return this.product3;
    }

    /**
     * Check if there is salsa verde available and if box has tomatillo add salsa verde and reduce it number
     *
     * @return true if salsa verde is added, false if not
     * */
    private boolean salsaVerde(){
        if(numOfSalsa > 0 && (this.product1.equals("Tomatillo") || this.product2.equals("Tomatillo") ||
            this.product3.equals("Tomatillo"))){
            numOfSalsa--;
            return true;
        }
        return false;
    }

    /**
     * String representation of the content of the box
     *
     * @return String representation of the content of the box
     * */
    public String toString(){
        String salsa = "";
        if(this.salsaVerde()){
            salsa = "\n4.Salsa verde";
        }
        return "The content of box: \n1." + this.product1 + "\n2." + this.product2 + "\n3." + this.product3 + salsa;
    }

}