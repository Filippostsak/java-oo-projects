package bankapp.model;

/**
 * A bank account that allows overdrafts.
 *
 * @author Tsakiris Filippos
 * @version 1.0
 */
public class OverdraftAccount extends Account {
    private double overdraftLimit;

    /**
     * Constructs an OverdraftAccount with the given account number, initial balance, and overdraft limit.
     *
     * @param accountNumber  The account number.
     * @param balance        The initial balance.
     * @param overdraftLimit The overdraft limit.
     */
    public OverdraftAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Withdraws the specified amount from the account, allowing overdrafts.
     *
     * @param amount The amount to withdraw.
     * @return true if the withdrawal is successful, false otherwise.
     */
    public boolean withdrawWithOverdraft(double amount) {
        double totalBalance = getBalance() + overdraftLimit;
        if (totalBalance >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    private void setBalance(double v) {
    }
}
