package ObjectOrientierung.Account;

public class CheckingsAccount extends SavingsAccount {
    public CheckingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double withdrawAmount) {
        double resultSubtraction = getBalance() - withdrawAmount;
        if (withdrawAmount>= getBalance()){
            System.out.println("You withdrawed: " + withdrawAmount);
            System.out.println("You withdrawed: " + resultSubtraction);
        } else{
            System.out.println("You withdrawed: " + withdrawAmount);
            System.out.println("Your new balance is: " + resultSubtraction);

        }
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
