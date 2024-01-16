package bankapp.model;

public class JointAccount extends Account {
    private String holder1;
    private String holder2;

    public JointAccount(int accountNumber, double balance, String holder1, String holder2) {
        super(accountNumber, balance);
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    public String[] getHolders() {
        return new String[]{holder1, holder2};
    }
}