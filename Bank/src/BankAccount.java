import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        System.out.println("Welcome to the banking app. Select any of the options below");
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do {      
            
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Statement");
            System.out.println("4. Balance");
            System.out.println("5. End transaction");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Deposit");
                    break;
                case 2:
                    System.out.println("Withdraw");
                    break;
                case 3:
                    System.out.println("Statement");
                    break;
                case 4:
                    System.out.println("Balance");
                    break;
                case 5:
                    System.out.println("Transaction ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            
        } while((choice!=5));

    }

}

class Account{
    float balanceAmount;

    public Account() {

    }

    public float getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(float balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

}