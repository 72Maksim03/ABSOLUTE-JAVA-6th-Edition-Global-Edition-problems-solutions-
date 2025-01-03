public class BoxOfProduce {
    private Produce[] products;

    public BoxOfProduce(int capacity){this.products = new Produce[capacity];}
    public BoxOfProduce(){this(3);}

    public Produce[] getProducts(){return this.products;}
    public Produce getProduct(int i){
        if(i < 0 || i >= products.length){
            System.out.println("Invalid index");
            return null;
        }
        return products[i];
    }
    public int getCapacity(){return products.length;}

    public void setProduct(String product, int i){
        if (i < 0 || i >= products.length){
            System.out.println("Invalid index");
            return;
        }
        String[] info = product.split(",");
        Produce newProduce;
        if (info[1].equalsIgnoreCase("fruit")) newProduce = new Fruit(info[0]);
        else if(info[1].equalsIgnoreCase("vegetable")) newProduce = new Vegetable(info[0]);
        else{
            System.out.println("Invalid input");
            return;
        }
        products[i] = newProduce;
    }

    public String toString(){
        String res = "";
        for(int i = 0; i < products.length; i++){
             res += (i + 1) + ". " + getProduct(i).toString() + "\n";
        }
        return res;
    }

    public int numOfVegetables(){
        int num = 0;
        for (int i = 0; i < products.length; i++)
            if (getProduct(i) instanceof Vegetable) num++;
        return num;
    }

    public int numOfFruits(){
        int num = 0;
        for (int i = 0; i < products.length; i++)
            if (getProduct(i) instanceof Fruit) num++;
        return num;
    }
}
