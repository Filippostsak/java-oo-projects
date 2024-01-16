// Στο αρχείο Main.java
package bankapp;

import bankapp.model.OverdraftAccount;
import bankapp.model.JointAccount;

/**
 * Κύρια κλάση για τον έλεγχο της λειτουργίας των λογαριασμών.
 */
public class Main {
    public static void main(String[] args) {
        // Δημιουργία λογαριασμών
        OverdraftAccount overdraftAccount = new OverdraftAccount(1, 1000.0, 500.0);
        JointAccount jointAccount = new JointAccount(2, 2000.0, "John", "Mike");

        // Εκτύπωση ιδιοτήτων λογαριασμών
        System.out.println("Overdraft Account Balance: " + overdraftAccount.getBalance());
        System.out.println("Joint Account Holders: " + String.join(", ", jointAccount.getHolders()));
    }
}
