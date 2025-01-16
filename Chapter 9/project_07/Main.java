import java.util.Scanner;
/**
 * A method that returns a special error code is usually better accomplished throwing an
 * exception instead. The following class maintains an account balance:
 *  class Account
 *  {
 *  private double balance;
 *  public Account()
 *  {
 *  balance = 0;
 *  }
 *  public Account(double initialDeposit)
 *  {
 *  balance = initialDeposit;
 *  }
 *  public double getBalance()
 *  {
 *  return balance;
 *  }
 *  // returns new balance or -1 if error
 *  public double deposit(double amount)
 *  {
 *  if (amount > 0)
 *  balance += amount;
 *  else
 *  return -1;// Code indicating error
 *  return balance;
 *  }
 *  // returns new balance or -1 if invalid amount
 *  public double withdraw(double amount)
 *  {
 *  if ((amount > balance) || (amount < 0))
 *  return -1;
 *  else
 *  balance -= amount;
 *  return balance;
 *  }
 *  }
 *  Rewrite the class so that it throws appropriate exceptions instead of returning −1
 * as an error code. Write test code that attempts to withdraw and deposit invalid
 * amounts and catches the exceptions that are thrown.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance in account");
        double initialBalance = sc.nextDouble();
        sc.nextLine();
        Account acc = new Account(initialBalance);
        System.out.println("Account was created with initial balance " + acc.getBalance());
        System.out.println("Do you want to withdraw or deposit? [y]/[n]");
        char choice = sc.nextLine().charAt(0);
        while(choice == 'y'){
            System.out.println("Do you want to withdraw or deposit? [w]/[d]");
            char operation = sc.nextLine().charAt(0);
            System.out.println("Enter amount you want to " + ((operation == 'd') ? "deposit" : "withdraw"));
            double amount = sc.nextDouble();
            sc.nextLine();
            if (operation == 'd'){
                try{
                    acc.deposit(amount);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            } else if(operation == 'w'){
                try{
                    acc.withdraw(amount);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            } else{
                System.out.println("Invalid choice. Please try again");
            }

            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Do you want to continue? [y]/[n]");
            choice = sc.nextLine().charAt(0);
        }
    }
}
