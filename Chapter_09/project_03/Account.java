public class Account {
    private String customerID;
    private String accNumber;
    private double initialBalance;

    public Account(String customerID, String accNumber, double initialBalance){
        setCustomerID(customerID);
        setAccNumber(accNumber);
        setInitialBalance(initialBalance);
    }

    public Account(){
        customerID = "No ID yet";
        accNumber = "No number yet";
        initialBalance = 0.0;
    }

    public void setCustomerID(String id) throws IllegalArgumentException{
        if (validateID(id)) customerID = id;
        else throw new IllegalArgumentException("Invalid Customer ID. ID should consist of 1 letter and 3 digits");
    }

    public void setAccNumber(String number) throws IllegalArgumentException{
        if (validateAccNumber(number)) accNumber = number;
        else throw new IllegalArgumentException("Invalid Account Number. Number should consist of 5 digits");
    }

    public void setInitialBalance(double balance) throws IllegalArgumentException{
        if (balance < 1000) throw new IllegalArgumentException("Initial balance should be above $1000");
        if (balance > 5000) throw new IllegalArgumentException("Initial balance should be below $5000");
        else initialBalance = balance;
    }

    public String getCustomerID(){return customerID;}
    public String getAccNumber(){return accNumber;}
    public double getInitialBalance(){return initialBalance;}

    public void withdraw(double balance) throws InvalidBalanceException{
        if (initialBalance - balance < 1000) throw new InvalidBalanceException("Balance can not be less than $1000");
        initialBalance -= balance;
    }

    public void deposit(double balance) throws InvalidBalanceException{
        if (initialBalance + balance > 5000) throw new InvalidBalanceException("Balance can not be more than $5000");
        initialBalance += balance;
    }

    private boolean validateAccNumber(String number){
        if (number.length() != 5) return false;
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i))) return false;
        return true;
    }

    private boolean validateID(String id){
        if (id.length() != 4) return false;
        if (!Character.isLetter(id.charAt(0))) return false;
        for (int i = 1; i < id.length(); i++)
            if (!Character.isDigit(id.charAt(i))) return false;
        return true;
    }
}
