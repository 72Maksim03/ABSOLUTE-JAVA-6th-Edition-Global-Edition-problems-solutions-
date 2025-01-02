public class Administrator extends SalariedEmployee{
    private String title;
    private String respArea;
    private String supervisor;

    public Administrator(String name, Date date, double salary, String title, String respArea, String supervisor){
        super(name, date, salary);
        this.title = title;
        this.respArea = respArea;
        this.supervisor = supervisor;
    }

    public Administrator(){
        super();
        this.title = "No title";
        this.respArea = "No response area";
        this.supervisor = "No supervisor";
    }

    public Administrator(Administrator other){
        super(other);
        this.title = other.title;
        this.respArea = other.respArea;
        this.supervisor = other.supervisor;
    }

    public String getTitle(){return this.title;}
    public String getRespArea(){return this.respArea;}
    public String getSupervisor(){return this.supervisor;}

    public void setTitle(String newTitle){this.title = newTitle;}
    public void setRespArea(String newRespArea){this.respArea = newRespArea;}
    public void setSupervisor(String newSupervisor){this.supervisor = newSupervisor;}

    public String toString(){
        return getName() + " " + getHireDate() + "\n$" + getSalary() + " per year" + "\nTitle: " + this.title +
                "\nResponse Area: " + this.respArea + "\nSupervisor: " + this.supervisor;
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Administrator otherObject = (Administrator) other;
        return otherObject.getName().equals(getName())
                && otherObject.getHireDate().equals(getHireDate())
                && otherObject.getTitle().equals(getTitle())
                && otherObject.getSalary() == getSalary()
                && otherObject.getRespArea().equals(getRespArea())
                && otherObject.getSupervisor().equals(getSupervisor());
    }
}