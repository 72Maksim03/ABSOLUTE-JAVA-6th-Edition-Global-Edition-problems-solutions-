public class Billing {
    private Doctor doctor;
    private Patient patient;
    private double amount;

    public Billing(Doctor doctor, Patient patient, double amount){
        this.doctor = doctor;
        this.patient = patient;
        this.amount = amount;
    }
    public Billing(){this(new Doctor(), new Patient(), 0.0);}
    public Billing(Billing other){this(other.doctor, other.patient, other.amount);}

    public Doctor getDoctor(){return new Doctor(doctor);}
    public Patient getPatient(){return new Patient(patient);}
    public double getAmount(){return amount;}
    public void setDoctor(Doctor doctor){this.doctor = doctor;}
    public void setPatient(Patient patient){this.patient = patient;}
    public void setAmount(double amount){this.amount = amount;}

    public String toString(){
        return doctor.toString() + "\n" + patient.toString() + "\nAmount: $" + amount;
    }

    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass()!= getClass()) return false;
        Billing otherBilling = (Billing) other;
        return doctor.equals(otherBilling.doctor)
                && patient.equals(otherBilling.patient)
                && amount == otherBilling.amount;
    }
}
