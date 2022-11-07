
import java.util.Scanner;
import classes.*;

public class BankAccount {
    public static void main(String[] args) {
        System.out.println("Welcome to the banking app. Select any of the options below");
        Scanner scanner = new Scanner(System.in);
        AccountBalance accountBalance = new AccountBalance(0);
        int choice;
        do {
            accountBalance.renderMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Deposit: ");
                    accountBalance.setTransactionAmount(scanner.nextFloat());
                    Deposit deposit = new Deposit(accountBalance.getTransactionAmount());
                    if (deposit.validateTransaction(accountBalance.getCurrentBalance(), accountBalance.getTransactionAmount())) {
                        accountBalance.setCurrentBalance(deposit.calculateTransaction(accountBalance.getCurrentBalance(),
                                                                                      accountBalance.getTransactionAmount()));
                        deposit.printToFile(accountBalance.getTransactionAmount());
                        System.out.println("Successful transaction!!! /n");
                    } else {
                        System.err.println("Invalid deposit amount. /n");
                    }

                    break;
                case 2:
                    System.out.print("Enter amount to Withdraw: ");
                    accountBalance.setTransactionAmount(scanner.nextFloat());
                    Withdraw withdraw = new Withdraw(accountBalance.getTransactionAmount());
                    if (withdraw.validateTransaction(accountBalance.getCurrentBalance(), accountBalance.getTransactionAmount())) {
                        accountBalance.setCurrentBalance(withdraw.calculateTransaction(accountBalance.getCurrentBalance(),
                                                                                       accountBalance.getTransactionAmount()));
                        withdraw.printToFile(accountBalance.getTransactionAmount());
                        System.out.println("Successful transaction!!! /n");
                    } else {
                        System.err.println("Transaction Failed!!!. /n");
                    }
                case 3:
                    System.out.println("Statement");
                    accountBalance.readLedger();
                    break;
                case 4:
                    System.out.println("Balance");
                    System.out.println("Your current balance is: " + accountBalance.getCurrentBalance());
                    break;
                case 5:
                    System.out.println("Transaction ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while ((choice != 5));
        scanner.close();
    }
}
