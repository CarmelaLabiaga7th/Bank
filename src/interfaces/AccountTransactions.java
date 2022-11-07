package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface AccountTransactions {

    public List<String> transactionLedger = new ArrayList<String>();

    public boolean validateTransaction(float transactionAmount, float currentBalance);

    float calculateTransaction(float currentBalance, float transactionAmount);

    public void printToFile(float transactionAmount);

    public float setNewBalance(float newBalance);

}
