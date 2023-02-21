package ObjectOrientierung.Account;

public class CreditAccount extends SavingsAccount {
    public CreditAccount(double balance) {
        super(balance);
    }


    public void deposit(double depositAmount) {
        double result = (-1 * getBalance()) + depositAmount;
        if (-1*getBalance() + depositAmount > 0) {
            System.out.println("This deposit is not possible, you have to lower it!");
        } else {
            System.out.println("You deposited: " + depositAmount);
            System.out.println("Your new balance is: " + result);
        }

    }

    public void accountBalance() {
        System.out.println("Your balance is: " + -1*getBalance());

    }

}
