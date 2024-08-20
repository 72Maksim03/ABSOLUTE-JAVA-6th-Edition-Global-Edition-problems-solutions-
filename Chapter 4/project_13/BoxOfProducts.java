public class BoxOfProducts {
    private String product1;
    private String product2;
    private String product3;

    public BoxOfProducts(String product1, String product2, String product3) {
        this.setProducts(product1, product2, product3);
    }

    public BoxOfProducts(){
        this.setProducts("not chosed yet", "not chosed yet", "not chosed yet");
    }

    public void setProducts(String product1, String product2, String product3) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }

    public void setProduct1(String product1){
        this.product1 = product1;
    }

    public void setProduct2(String product2){
        this.product2 = product2;
    }

    public void setProduct3(String product3){
        this.product3 = product3;
    }

    public String getProduct1(){
        return this.product1;
    }

    public String getProduct2(){
        return this.product2;
    }

    public String getProduct3(){
        return this.product3;
    }

    public String toString(){
        return "The content of box: \n1." + this.product1 + "\n2." + this.product2 + "\n3." + this.product3;
    }

}
