package Maths_DSA;

public class hcfandlcm {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    // via euclidean algorithm
    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
