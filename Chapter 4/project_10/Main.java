/**
 *Your vet’s office is using the Pet class defined in Display 4.15 and would like to
 * include a way to calculate the dosage amount for drugs that are commonly administered for
 * dogs and cats. Make the following modifications to the class:
 * • Add an instance variable that indicates if the type of the pet is a dog or a cat.
 * • Modify the constructor and the set method to include the type of pet (i.e.,
 * dog or cat).
 * Add a method named acepromazine( ) that returns as a double the dosage
 * in ml for the sedative acepromazine.
 * • Add a method named carprofen( ) that returns as a double the dosage in
 * ml for the pain killer carprofen.
 *  The dosage calculation is
 * Dosage1ml2 = Weight
 * 2.2
 * * mg per kg
 * mg per ml
 *  Weight is in pounds.
 * • For acepromazine, use mg per ml = 10, and mg per kg = 0.03 for dogs and
 * 0.002 for cats.
 * • For carprofen, use mg per ml = 12, and mg per kg = 0.5 for dogs and 0.25 for cats.
 *  Modify the main method in Display 4.16 to include tests of the new methods.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pet usersPet = new Pet("Jane Doe");
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        System.out.println(usersPet);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the pet's name:");
        String name = keyboard.nextLine();
        System.out.println("Please enter the pet's age:");
        int age = keyboard.nextInt();
        System.out.println("Please enter the pet's weight:");
        double weight = keyboard.nextDouble();
        System.out.println("Please enter the pet's type:(dog or cat)");
        String type = keyboard.next();
        usersPet.set(name, age, weight, type);
        System.out.println("My records now say:");
        System.out.println(usersPet);
        double acepromazineDosage = usersPet.acepromazine();
        double carprofenDosage = usersPet.carprofen();
        System.out.println("Dosage of acepromazine: " + acepromazineDosage);
        System.out.println("Dosage of carprofen: " + carprofenDosage);
    }
}