public class Clerk extends Employee {
    public Clerk(String id, String name, String department, double salary, int leaveDays){
        super(id, name, department, salary, "Clerk", leaveDays);
    }
    public Clerk(){
        super("No id", "No name", "No department", 0.0, "Clerk", 0);
    }
    public double getBonus(){return getSalary() + 100;}
}
