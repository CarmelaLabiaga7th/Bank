package classes;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    List<String> accountLedger = new ArrayList<String>();

    public List<String> getAccountLedger() {
        return accountLedger;
    }

    public void setAccountLedger(List<String> accountLedger) {
        this.accountLedger = accountLedger;
    }

    public void addToList(String transactionLog) {
        accountLedger.add(transactionLog);
    }
}
