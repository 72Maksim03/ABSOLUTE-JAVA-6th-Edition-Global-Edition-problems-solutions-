/**
 * Programming Project 4.10 required adding an instance variable to the Pet class
 * defined in Display 4.15 to indicate if the pet is a dog or cat. A better organization is to define Pet as a superclass of the Dog and Cat classes. This organization
 * eliminates the need for an instance variable to indicate the type of the pet. Do
 * or redo Programming Project 4.10 with inheritance. The acepromazine() and
 * carprofen() methods should be defined in the Pet class to simply return 0. Override both methods in the Dog and Cat classes to calculate the correct dosage. Write
 * a main method with appropriate tests to exercise the changes.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 2, 2.3);
        Dog dog1 = new Dog("Dog", 3, 8.8);

        System.out.println("Acepromazine for cat: " + cat1.acepromazine());
        System.out.println("Carprofen for cat: " + cat1.carprofen());
        System.out.println("Acepromazine for dog: " + dog1.acepromazine());
        System.out.println("Carprofen for dog: " + dog1.carprofen());
    }
}
