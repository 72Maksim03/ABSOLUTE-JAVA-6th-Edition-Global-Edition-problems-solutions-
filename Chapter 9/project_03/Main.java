import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Modify the previous exercise to include methods for amount deposited and
 * amount withdrawn. Create your own exception class which will check inside
 * the method for the amount deposited so that after the deposit, the maximum
 * balance in the account must not be more than $5000. Also, check inside the
 * method for amount withdrawn so that the available balance after the withdrawal
 * does not go below $1000. Invoke the defined methods from your main method
 * and catch the exceptions.
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
        System.out.println("Account successfully created.");
        System.out.println("Customer ID: " + acc.getCustomerID());
        System.out.println("Account number: " + acc.getAccNumber());
        System.out.println("Balance: " + acc.getInitialBalance());

        System.out.println("Do you want to withdraw or deposit? [y]/[n]");
        char choice = sc.next().charAt(0);

        while(choice == 'y'){
            System.out.println("What you want to do? (Withdraw[w]/Deposit[d])");
            char operation = sc.next().charAt(0);
            try{
                if (operation == 'd'){
                    System.out.println("Enter the amount to deposit:");
                    acc.deposit(sc.nextDouble());
                } else if(operation == 'w'){
                    System.out.println("Enter the amount to withdraw:");
                    acc.withdraw(sc.nextDouble());
                } else{
                    System.out.println("Invalid choice. Please try again");
                }
            } catch (InvalidBalanceException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please try again");
            }

            System.out.println("Customer ID: " + acc.getCustomerID());
            System.out.println("Account number: " + acc.getAccNumber());
            System.out.println("Balance: " + acc.getInitialBalance());

            sc.nextLine();
            System.out.println("Do you want to continue?");
            choice = sc.next().charAt(0);
        }
    }
}
