package classes;

import java.io.FileReader;
import java.io.IOException;

public class AccountBalance {
    float currentBalance;
    float transactionAmount;
    Statement statement = new Statement();

    public AccountBalance() {
    }

    public AccountBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void readLedger() {
        try {
            FileReader fr = new FileReader("C:\\Users\\sanreg\\eclipse-workspace\\Banking\\src\\ledger.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            System.err.println("File Error: " + e.getMessage());
        }

    }

    public void renderMenu() {
        System.out.println("---------------------------------");
        System.out.println("Select any of the options below: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Statement");
        System.out.println("4. Balance");
        System.out.println("5. End transaction");
    }

}
