package interfaces;

import java.util.List;

public interface AccountTransactions {
//    public void deposit(int depositAmount);
//
//    public void withdraw(int withdrawAmount);
//
//    public void statement();

//    public void getBalance();

    public boolean validateTransaction(int transactionAmount, float currentBalance); // Check
                                                                 // validity of
                                                                 // input and
                                                                 // transaction

    public int calculateTransaction(int currentBalance, int transactionAmount);// calculate

    //public void addtoStatement(String transaction, List accountLedger);

}
