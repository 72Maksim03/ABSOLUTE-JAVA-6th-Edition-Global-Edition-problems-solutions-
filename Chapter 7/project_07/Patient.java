public class Patient extends Person{
    private Doctor doctor;

    public Patient(String name, Doctor doctor){
        super(name);
        this.doctor = doctor;
    }
    public Patient(){
        super();
        this.doctor = new Doctor();
    }
    public Patient(Patient other){this(other.getName(), other.doctor);}

    public Doctor getDoctor(){return new Doctor(doctor);}
    public void setDoctor(Doctor doctor){this.doctor = doctor;}

    public String toString(){
        return "Patient: " + getName() + "\nDoctor: " + doctor;
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Patient otherPatient = (Patient) other;
        return otherPatient.getName().equals(getName()) && otherPatient.getDoctor().equals(getDoctor());
    }
}
