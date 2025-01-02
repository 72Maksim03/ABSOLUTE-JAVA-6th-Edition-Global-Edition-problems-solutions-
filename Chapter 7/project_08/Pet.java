public class Pet {
    private String name;
    private int age;
    private double weight;

    public Pet(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Pet(){this("No name", 0, 0.0);}

    public String getName(){return name;}
    public int getAge(){return age;}
    public double getWeight(){return weight;}
    public void  setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(double weight){this.weight = weight;}

    public double acepromazine(){
        return 0;
    }

    public double carprofen(){
        return 0;
    }
}
