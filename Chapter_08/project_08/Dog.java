public class Dog extends Pet{
    public Dog(String name, int age, double weight){super(name, age, weight);}
    public Dog(){super();}

    public double acepromazine(){
        double mgPerKg = 10;
        double mgPerMl = 0.03;
        return ((getWeight() / 22) * mgPerKg) / mgPerMl;
    }

    public double carprofen(){
        double mgPerKg = 12;
        double mgPerMl = 0.5;
        return ((getWeight() / 22) * mgPerKg) / mgPerMl;
    }
    public String petType(){return "Dog";}
}
