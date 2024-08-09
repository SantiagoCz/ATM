import java.util.Scanner;

public abstract class ATMOperations {
    protected int withdrawalAmount, depositAmount;
    protected double transactionAmount;
    private static double balance;
    Scanner input = new Scanner(System.in);

    public void displayMenu() {
        int exit = 0;
        int selection = 0;

        while (exit != 2) {
            while (exit == 0) {
                System.out.println("SELECT AN OPTION: ");
                System.out.println("    1. Check balance.");
                System.out.println("    2. Withdraw money.");
                System.out.println("    3. Deposit money.");
                System.out.println("    4. Exit.");

                selection = input.nextInt();

                if (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
                    System.out.println("Error: Option NOT available. Please enter a valid option.");
                }

                if (selection == 1) {
                    ATMOperations operation = new CheckBalanceOperation();
                    operation.performTransaction();
                } else if (selection == 2) {
                    ATMOperations operation = new WithdrawMoneyOperation();
                    operation.performTransaction();
                } else if (selection == 3) {
                    ATMOperations operation = new DepositMoneyOperation();
                    operation.performTransaction();
                } else if (selection == 4) {
                    System.out.println("Thank you, please come back soon.");
                    exit = 2;
                }
            }
        }
    }

    public void getWithdrawalAmount() {
        withdrawalAmount = input.nextInt();
    }

    public void getDepositAmount() {
        depositAmount = input.nextInt();
    }

    public abstract void performTransaction();

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        ATMOperations.balance = balance;
    }
}
