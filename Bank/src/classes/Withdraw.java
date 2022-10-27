package classes;

import java.util.List;

import interfaces.AccountTransactions;
public class Withdraw implements AccountTransactions{
    int CurrentBalance;
    int transactionAmount;
    Statement statement = new Statement();
    @Override
    public boolean validateTransaction(int transactionAmount, float currentBalance) {
        if (transactionAmount <= 0 ||
                transactionAmount > 10000 ||
                (transactionAmount%100) != 0 ||
                transactionAmount > currentBalance
                ) {
            return false;
        }
        return true;
    }

    @Override
    public int calculateTransaction(int currentBalance, int transactionAmount) {
        // TODO Auto-generated method stub
        int newBalance = currentBalance - transactionAmount;
        return newBalance;
    }

    public void addtoStatement(String transaction) {
        statement.addToList("-" + transaction);
        
    }

}
