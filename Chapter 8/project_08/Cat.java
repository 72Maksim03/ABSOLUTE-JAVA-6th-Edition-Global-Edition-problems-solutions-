public class Cat extends Pet{
    public Cat(String name, int age, double weight){super(name, age, weight);}
    public Cat(){super();}

    public double acepromazine(){
        double mgPerKg = 10;
        double mgPerMl = 0.002;
        return ((getWeight() / 22) * mgPerKg) / mgPerMl;
    }

    public double carprofen(){
        double mgPerKg = 12;
        double mgPerMl = 0.25;
        return ((getWeight() / 22) * mgPerKg) / mgPerMl;
    }
    public String petType(){return "Cat";}
}
