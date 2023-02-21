package ObjectOrientierung.Account;

public class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;

    }

    public void withdraw(double withdrawAmount) {
        double result = balance - withdrawAmount;
        if(withdrawAmount >= balance) {
            System.out.println("This payout is not possible!");
        } else {
            System.out.println("You withdrawed: "+ withdrawAmount);
            System.out.println("Your new balance is:" + result);
        }
    }

    public void deposit(double depositAmount) {
        double result = balance + depositAmount;
        System.out.println("You deposited: " + depositAmount);
        System.out.println("Your new balance is: "+ result);
    }

    public void accountBalance() {
        System.out.println("This is your balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
