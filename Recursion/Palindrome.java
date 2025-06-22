package Recursion;

public class Palindrome {
    public static void main(String[] args) {
       System.out.println(palindrome(54145));
    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n) + 1);

        return helper(n, digits);
    }

     static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }
    static boolean palindrome(int n){
        if (n == reverse2(n)) {
            return true;
        }
        return false;
    }
}
