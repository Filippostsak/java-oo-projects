package bankapp.model;

public class OverdraftAccount extends Account {
    private double overdraftLimit;

    public OverdraftAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

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