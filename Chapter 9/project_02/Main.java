import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Define a class to maintain bank accounts of customers. The program should place
 * the code into a try-catch block with multiple catches to check for the validity of
 * various attributes based on the following criteria.
 *  a. Customer ID must start with a letter and should be followed by three digits.
 *  b. Account number must be of five digits.
 *  c. Initial balance must be above $1000.
 *  Print suitable error matches within the catch block. If any of the criteria mentioned
 * above is not fulfilled, the program should loop back and let the user enter new data.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);
        boolean check = false;

        while(!check){
            try{
                if (acc.getCustomerID().equals("No ID yet")){
                    System.out.println("Enter customer ID. (1 letter and 3 digits)");
                    acc.setCustomerID(sc.nextLine());
                }
                if (acc.getAccNumber().equals("No number yet")){
                    System.out.println("Enter account number. (5 digits)");
                    acc.setAccNumber(sc.nextLine());
                }
                if (acc.getInitialBalance() == 0.0){
                    System.out.println("Enter initial balance.");
                    acc.setInitialBalance(sc.nextDouble());
                }
                check = true;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
}
