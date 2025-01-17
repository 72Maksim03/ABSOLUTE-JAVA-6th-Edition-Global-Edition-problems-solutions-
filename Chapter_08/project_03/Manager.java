public class Manager extends Employee{
    public Manager(String id, String name, String department, double salary, int leaveDays){
        super(id, name, department, salary, "Manager", leaveDays);
    }
    public Manager(){
        super("No id", "No name", "No department", 0.0, "Manager", 0);
    }

    public double getBonus(){
        return getSalary() + 300;
    }
}
