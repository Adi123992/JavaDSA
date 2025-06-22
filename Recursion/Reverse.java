package Recursion;

public class Reverse {
    public static void main(String[] args) {
        reverse(54321);
        System.out.println(sum);
        System.out.println("Via helper function method : ");
        int ans = reverse2(12345);
        System.out.println(ans);
    }

    static int sum = 0;

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n) + 1);

        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));

    }
}
