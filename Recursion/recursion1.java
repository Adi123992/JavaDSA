package Recursion;

public class recursion1 {
    public static void main(String[] args) {
        System.out.println("Decending order :");
        fun(5);
        System.out.println();
        System.out.println("Ascending order : ");
        funrev(7);
    }
//descnding printingS
    private static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
//ascending printing 
    private static void funrev(int n) {
        if (n == 0) {
            return;
        }

        funrev(n - 1);
        System.out.println(n);
    }
}
