public class SqrRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // precision up to 3 decimal places
        System.out.printf("%.3f",sqrt(n, p));
    }

    private static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        // Binary search for integer part
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            }
            if (m * m < n) {
                root = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        // For decimal precision
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr; // step back one increment
            incr /= 10;
        }

        return root;
    }
}
