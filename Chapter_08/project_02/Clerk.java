public class Clerk extends Employee {
    public Clerk(String id, String name, String department, double salary){
        super(id, name, department, salary, "Clerk");
    }
    public Clerk(){
        super("No id", "No name", "No department", 0.0, "Clerk");
    }
    public double getBonus(){return getSalary() + 100;}
}
