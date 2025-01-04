public class Employee {
    private String id;
    private String name;
    private String department;
    private double salary;
    private String designation;

    public Employee(String id, String name, String department, double salary, String designation){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }
    public Employee(){this("No id", "No name", "No department", 0.0, "No designation");}

    public String getId(){return this.id;}
    public String getName(){return this.name;}
    public String getDepartment(){return this.department;}
    public double getSalary(){return this.salary;}
    public String getDesignation(){return this.designation;}
    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setDepartment(String department){this.department = department;}
    public void setSalary(double salary){this.salary = salary;}
    public void setDesignation(String designation){this.designation = designation;}

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Employee otherEmp = (Employee) other;
        return getDesignation().equals(otherEmp.getDesignation());
    }

    public String toString(){
        return "Employee ID: " + this.id + "\nName: " + this.name
                + "\nDepartment: " + this.department + "\nSalary: " + this.salary
                + "\nDesignation: " + this.designation;
    }

    public double getBonus(){return salary + 200;}
}