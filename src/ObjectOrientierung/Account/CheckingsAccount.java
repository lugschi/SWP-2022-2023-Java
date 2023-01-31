package ObjectOrientierung.Account;

public class CheckingsAccount extends SavingsAccount {
    public CheckingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {

    }

    @Override
    public void deposit(double depositAmount) {
        super.deposit(depositAmount);
    }

    @Override
    public void accountBalance() {
        super.accountBalance();
    }
}
