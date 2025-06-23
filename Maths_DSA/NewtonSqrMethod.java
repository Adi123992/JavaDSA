package Maths_DSA;

//find the sqroot of a number via Newrton Ralphson method
public class NewtonSqrMethod {
    public static void main(String[] args) {
        int num = 36;
        System.out.println(sqrt(num));
    }

    private static double sqrt(int n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;// it updates the value of x with root so that if can take up new value for
                     // evulation of the sqr root
        }

        return root;
    }
}
