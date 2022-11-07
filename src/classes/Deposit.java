package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import interfaces.AccountTransactions;

public class Deposit extends AccountBalance implements AccountTransactions {

    AccountBalance accountBalance = new AccountBalance();

    public Deposit(float transactionAmount) {
        this.accountBalance.getCurrentBalance();
        this.accountBalance.setTransactionAmount(transactionAmount);
    }

    @Override
    public boolean validateTransaction(float currentBalance, float transactionAmount) {
        if (transactionAmount <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public float calculateTransaction(float currentBalance, float transactionAmount) {
        float newBalance = currentBalance + transactionAmount;
        return newBalance;

    }

    @Override
    public void printToFile(float transactionAmount) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\sanreg\\eclipse-workspace\\Banking\\src\\ledger.txt", true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println("+" + Float.toString(transactionAmount));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public float setNewBalance(float newBalance) {
        return newBalance;
    }

}
