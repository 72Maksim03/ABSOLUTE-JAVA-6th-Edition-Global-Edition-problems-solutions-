public class Doctor extends SalariedEmployee {
    private String specialty;
    private double visitFee;

    public Doctor(){
        super();
        specialty = "No specialty";
        visitFee = 0.0;
    }

    public Doctor(String name, Date date, double salary, String specialty, double visitFee){
        super(name, date, salary);
        this.specialty = specialty;
        this.visitFee = visitFee;
    }

    public Doctor(Doctor originalObject){
        super(originalObject);
        this.specialty = originalObject.specialty;
        this.visitFee = originalObject.visitFee;
    }

    public String getSpecialty(){return this.specialty;}
    public double getVisitFee(){return this.visitFee;}
    public void setSpecialty(String specialty){this.specialty = specialty;}
    public void setVisitFee(double visitFee){this.visitFee = visitFee;}

    public String toString(){
        return "Doctor: " + getName() + " " + getHireDate().toString() + "\n$" + getSalary() + " per year"
                + "\nSpecialty: " + getSpecialty() + "\nVisit Fee: $" + getVisitFee();
    }

    public boolean equals(Object other){
        if(other == null) return false;
        if (other.getClass() != getClass()) return false;
        Doctor otherDoctor = (Doctor) other;
        return otherDoctor.getName().equals(getName())
                && otherDoctor.getHireDate().equals(getHireDate())
                && otherDoctor.getSalary() == getSalary()
                && otherDoctor.getSpecialty().equals(getSpecialty())
                && otherDoctor.getVisitFee() == getVisitFee();
    }
}