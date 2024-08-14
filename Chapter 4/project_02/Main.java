/**
 * Define a class called CalAge. This class is used to calculate age of a person from her or
 * his date of birth and the current date. Include a mutator method that allows the user to
 * enter her or his date of birth and set the value for current date. Also include a method to
 * return the age in years and months (for example, 25.5 years) as a double value. Include
 * an additional method to check if the date of birth entered by the user is a valid one. For
 * example, 30 February 2008 is an invalid date. Embed your class in a test program.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth (dd/mm/yyyy):");
        String birthday = scanner.nextLine();
        System.out.println("Enter current date (dd/mm/yyyy):");
        String currentDate = scanner.nextLine();
        CalAge calAge = new CalAge(birthday, currentDate);
        System.out.println("Age: " + calAge.getAge());
    }
}
