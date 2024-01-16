package bankapp.model;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
    public double getBalance(){
        return balance;
    }
}
