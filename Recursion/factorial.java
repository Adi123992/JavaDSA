package Recursion;

public class factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
//here since we are having an integer an a return type so we r using recursion in return statements
    private static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);

    }
}
