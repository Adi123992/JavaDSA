package Maths_DSA;

//sieve of eratosthenes is a method by which we can efficiently find the prime number via excluding the unwanted factor of the initial iterators and hence increasing the efficiency..
public class SievePrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = true; // mark as not prime
                }
            }
        }

        // Print all primes clear
        for (int i = 2; i <= n; i++) {
            //all false members are prime
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
