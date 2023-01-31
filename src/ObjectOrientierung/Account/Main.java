package ObjectOrientierung.Account;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(5000);

        s1.deposit(200);
        s1.withdraw(500);
        s1.accountBalance();

        CheckingsAccount c1 = new CheckingsAccount(3813.35);



    }




}
