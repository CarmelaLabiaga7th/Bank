package classes;
import java.util.List;

import interfaces.AccountTransactions;
public class Deposit implements AccountTransactions{
    int CurrentBalance;
    int transactionAmount;
    String operator;
    Statement statement = new Statement();
   
    
    public Deposit(int currentBalance, int transactionAmount) {
        super();
        CurrentBalance = currentBalance;
        this.transactionAmount = transactionAmount;
    }

    @Override
    public boolean validateTransaction(int transactionAmount, float currentBalance) {
        // TODO Auto-generated method stub
        if (transactionAmount <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public int calculateTransaction(int currentBalance, int transactionAmount) {
        // TODO Auto-generated method stub
        int newBalance = currentBalance + transactionAmount;
        return newBalance;
        
    }

    public void addtoStatement(String transaction) {
        statement.addToList("+" + transaction);
        
    }

}
