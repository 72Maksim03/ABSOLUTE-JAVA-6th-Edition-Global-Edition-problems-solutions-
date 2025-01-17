public class Teacher extends Person{
    private String subject;
    private int salary;

    public Teacher(String firstName, String lastName, String subject, int salary){
        super(firstName, lastName);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject(){return this.subject;}
    public int getSalary(){return this.salary;}
    public void setSubject(String subject){this.subject = subject;}
    public void setSalary(int salary){this.salary = salary;}

    public String displayDetails(){
        return "Teacher " + super.displayDetails() +
                "\nSubject: " + this.subject +
                "\nSalary: $" + this.salary;
    }
}
