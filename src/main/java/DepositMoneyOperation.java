
public class DepositMoneyOperation extends ATMOperations {

    @Override
    public void performTransaction() {
        System.out.println("How much would you like to deposit?: ");
        getDepositAmount();
        transactionAmount = getBalance();
        setBalance(transactionAmount + depositAmount);
        System.out.println("You deposited: " + depositAmount);
        System.out.println("Your current balance is: " + getBalance());
    }
}