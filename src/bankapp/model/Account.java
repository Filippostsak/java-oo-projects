package bankapp.model;

/**
 * The base class for a bank account.
 *
 * @author Your Name
 * @version 1.0
 */
public class Account {
    private int accountNumber;
    private double balance;

    /**
     * Constructs an Account with the given account number and initial balance.
     *
     * @param accountNumber The account number.
     * @param balance       The initial balance.
     */
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to withdraw.
     * @return true if the withdrawal is successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Gets the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }
}
