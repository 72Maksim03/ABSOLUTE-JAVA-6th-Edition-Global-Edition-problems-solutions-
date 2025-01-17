public class Manager extends Employee{
    public Manager(String id, String name, String department, double salary){
        super(id, name, department, salary, "Manager");
    }
    public Manager(){
        super("No id", "No name", "No department", 0.0, "Manager");
    }

    public double getBonus(){
        return getSalary() + 300;
    }
}
