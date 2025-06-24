package Maths_DSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
        factor1(n);
        factor2(n);
        factor3(n);
    }

    // o(n)
    private static void factor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    // efficient method to find the factor of a number o(sqrt(n))
    private static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " " + n / i + " ");
            }
        }
        System.out.println();

    }

    // both time and spcae complexity with o(sqrt(n))
    private static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
