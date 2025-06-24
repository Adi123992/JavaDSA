package Maths_DSA;

public class XorRange {
    public static void main(String[] args) {
        // range xor for a,b = xor(b)^xor(a-1);
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        int ans2 = 0;
        // for checking and verification ( this throws TLE : time limit exception for
        // large numbers)
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);

    }

    private static int xor(int b) {
        if (b % 4 == 0) {
            return b;
        }

        if (b % 4 == 1) {
            return 1;
        }

        if (b % 4 == 2) {
            return b + 1;
        }

        return 0;
    }
}
