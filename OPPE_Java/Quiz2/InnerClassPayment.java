package OPPE_Java.Quiz2;

//Public test case (Input):
//999
//Output:
//Money debited current balance is 1.0

import java.util.*;

interface Transferable {
    public abstract String transfer();
}

class PaymentApp {
    String accno;

    public PaymentApp(String n) {
        accno = n;
    }

    //DEFINE method payRequest()
    public Transferable payRequest(double amt) {
        //method1
//        Transferable t = new Account(amt);
//        return t;
        //method2
        return new Account(amt);
    }

    private class Account implements Transferable {
        double amount;
        double balance;

        public Account(double a) {
            amount = a;
            balance = 1000;
        }

        public String transfer() {
            if (balance < amount)
                return "Failed transaction";

            else {
                balance = balance - amount;
                return "Money debited current balance is " + balance;
            }
        }


    }
}

public class InnerClassPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentApp u1 = new PaymentApp("ACC101010");
        Transferable t1 = u1.payRequest(sc.nextDouble());
        System.out.println(t1.transfer());
    }
}

