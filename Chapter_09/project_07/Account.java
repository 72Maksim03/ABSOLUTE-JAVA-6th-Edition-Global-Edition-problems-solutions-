public class Account {
    private double balance;

    /**
     * Constructs Account object with specified initial balance
     * @param initialBalance initial balance
     * */
    public Account(double initialBalance) {balance = initialBalance;}
    /**
     * Constructs Account object with initial balance 0
     * */
    public Account(){this(0);}

    /**
     * Returns current balance
     * @return balance
     * */
    public double getBalance(){return balance;}

    /**
     * Adds specified amount to the balance
     *
     * @throws IllegalArgumentException if amount is negative
     * */
    public void deposit(double amount) throws IllegalArgumentException{
        if (amount >= 0) balance += amount;
        else throw new IllegalArgumentException("Deposit amount can not be negative");
    }

    /**
     * Withdraws specified amount from the balance
     *
     * @throws IllegalArgumentException if amount is negative or greater than balance
     * */
    public void withdraw(double amount) throws IllegalArgumentException{
        if (amount < 0 || amount > balance)
            throw new IllegalArgumentException("Withdraw amount can not be negative or greater than balance");
        balance -= amount;
    }
}