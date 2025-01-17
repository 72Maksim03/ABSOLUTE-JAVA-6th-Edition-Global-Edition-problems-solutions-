public class Pet {
    private String name;
    private int age; //in years
    private double weight; //in pounds
    private String type;

    public String toString() {
        return ("Name: " + this.name + "\nType: " + this.type + "\nAge: " + this.age + " years"
         + "\nWeight: " + this.weight + " pounds");
    }

    public Pet(String initialName,int initialAge, double initialWeight, String initialtype) {
        this.name = initialName;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else if(!(initialtype.equalsIgnoreCase("cat") || initialtype.equalsIgnoreCase("dog"))){
            System.out.println("Pet type should be dog or cat");
            System.exit(0);
        } else {
            this.age = initialAge;
            this.weight = initialWeight;
            this.type = initialtype;
        }
    }
    public void set(String newName,int newAge,double newWeight, String newType) {
        this.name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else if(!(newType.equalsIgnoreCase("cat") || newType.equalsIgnoreCase("dog"))){
            System.out.println("Pet type should be dog or cat");
            System.exit(0);
        } else {
            this.age = newAge;
            this.weight = newWeight;
            this.type = newType;
        }
    }
    public Pet(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.type = "no type yet";
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public Pet(int initialAge) {
        this.name = "No name yet.";
        this.weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        this.age = initialAge;
        this.type = "no type yet";
    }
    public void setAge(int newAge) {
        if (newAge < 0){
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            this.age = newAge;
    }
    public Pet(double initialWeight) {
        this.name = "No name yet";
        this.age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        this.weight = initialWeight;
        this.type = "no type yet";
    }
    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            this.weight = newWeight;
    }
    public Pet() {
        this.name = "No name yet.";
        this.age = 0;
        this.weight = 0;
        this.type = "no type yet";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public String getType(){
        return this.type;
    }

    public double acepromazine(){
        double mgPerKg;
        double mgPerMl;
        if(this.type.equalsIgnoreCase("dog")){
            mgPerMl = 10;
            mgPerKg = 0.03;
        } else{
            mgPerMl = 10;
            mgPerKg = 0.002;
        }
        return ((this.weight / 22) * mgPerKg) / mgPerMl;
    }

    public double carprofen(){
        double mgPerKg;
        double mgPerMl;
        if(this.type.equalsIgnoreCase("dog")){
            mgPerMl = 12;
            mgPerKg = 0.5;
        } else{
            mgPerMl = 12;
            mgPerKg = 0.25;
        }
        return ((this.weight / 22) * mgPerKg) / mgPerMl;
    }
}