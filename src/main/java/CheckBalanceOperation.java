
public class CheckBalanceOperation extends ATMOperations {

    @Override
    public void performTransaction() {
        System.out.println("Your balance is: " + getBalance());
    }
}