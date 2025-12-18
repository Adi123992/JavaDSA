package OOPS;

class BankAccount {
    private static double interestRate = 3.5;
    private int accountId;

    public BankAccount(int accId) {
        accountId = accId;
    }

    public final double calculateInterest() {
        return interestRate * 0.01;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountId) {
        super(accountId);
    }

//    public final double calculateInterest() { // LINE 1
//        return (interestRate + 0.5) * 0.01;
//    }
// LINE 2
}

public class BankTest {
    public static void main(String[] args) {
        //SavingsAccount s1 = new BankAccount(505); // LINE 3
        BankAccount b1 = new SavingsAccount(501); // LINE 4
        System.out.println(b1.calculateInterest());
        //System.out.println(s1.calculateInterest());
    }
}

