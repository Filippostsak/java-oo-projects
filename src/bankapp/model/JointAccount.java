package bankapp.model;

/**
 * A bank account with joint ownership.
 *
 * @author Tsakiris Filippos
 * @version 1.0
 */
public class JointAccount extends Account {
    private String holder1;
    private String holder2;

    /**
     * Constructs a JointAccount with the given account number, initial balance, and holders' names.
     *
     * @param accountNumber The account number.
     * @param balance       The initial balance.
     * @param holder1       The name of the first account holder.
     * @param holder2       The name of the second account holder.
     */
    public JointAccount(int accountNumber, double balance, String holder1, String holder2) {
        super(accountNumber, balance);
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    /**
     * Gets the names of the account holders.
     *
     * @return An array containing the names of the account holders.
     */
    public String[] getHolders() {
        return new String[]{holder1, holder2};
    }
}
