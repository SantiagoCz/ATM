
public class WithdrawMoneyOperation extends ATMOperations {

    @Override
    public void performTransaction() {
        System.out.println("How much would you like to withdraw?: ");
        getWithdrawalAmount();
        if (withdrawalAmount <= getBalance()) {
            transactionAmount = getBalance();
            setBalance(transactionAmount - withdrawalAmount);
            System.out.println("You withdrew: " + withdrawalAmount);
            System.out.println("Your current balance is: " + getBalance());
        } else {
            System.out.println("Insufficient funds for this transaction.");
        }
    }
}