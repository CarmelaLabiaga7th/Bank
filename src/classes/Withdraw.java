package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import interfaces.AccountTransactions;

public class Withdraw extends AccountBalance implements AccountTransactions {
    Statement statement = new Statement();
    AccountBalance accountBalance = new AccountBalance();

    public Withdraw(float currentBalance) {
        this.accountBalance.getCurrentBalance();
        this.accountBalance.setTransactionAmount(transactionAmount);
    }

    @Override
    public boolean validateTransaction(float currentBalance, float transactionAmount) {
        if (transactionAmount > 10_000 || (transactionAmount % 100) != 0 || (transactionAmount % 1) != 0 || transactionAmount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
            return false;
        } else if (transactionAmount > currentBalance) {
            System.out.println("Insufficient Balance in your Account");
            return false;
        } else {
            return true;
        }

    }

    @Override
    public float calculateTransaction(float currentBalance, float transactionAmount) {
        float newBalance = currentBalance - transactionAmount;
        return newBalance;
    }

    @Override
    public void printToFile(float transactionAmount) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\sanreg\\eclipse-workspace\\Banking\\src\\ledger.txt", true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println("-" + Float.toString(transactionAmount));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            
        }
    }

    @Override
    public float setNewBalance(float newBalance) {
        return newBalance;
    }

}
