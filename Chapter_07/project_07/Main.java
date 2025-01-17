/**
 * Give the definition of two classes, Patient and Billing, whose objects are records
 * for a clinic. Patient will be derived from the class Person given in Programming
 * Project 7.6. A Patient record has the patient’s name (inherited from the class
 * Person) and primary physician of type Doctor defined in Programming Project 7.5
 * A Billing object will contain a Patient object, a Doctor object, and an amount
 * due of type double. Be sure your classes have a reasonable complement of constructors,
 * accessor and mutator methods, and suitably defined equals and toString
 * methods. First write a driver program to test all your methods, then write a test
 * program that creates at least two patients, at least two doctors, and at least two
 * Billing records, and then prints out the total income from the Billing records.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Doctor1", new Date(1, 1, 2020), 24000, "Pediatrician", 2.5);
        Doctor doc2 = new Doctor("Doctor2", new Date(3, 15, 2021), 25000, "Pediatrician", 2);

        Patient patient1 = new Patient("Patient1", doc1);
        Patient patient2 = new Patient("Patient2", doc2);

        Billing billing1 = new Billing(doc1, patient1, 50);
        Billing billing2 = new Billing(doc2, patient2, 75);

        System.out.println("Billing1:\n" + billing1);
        System.out.println();
        System.out.println("Billing2:\n" + billing2);

        System.out.println();
        System.out.println("Total amount: $" + (billing1.getAmount() + billing2.getAmount()));
    }
}
