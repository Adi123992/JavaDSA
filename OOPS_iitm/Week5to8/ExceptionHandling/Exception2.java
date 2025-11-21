package OOPS_iitm.Week5to8.ExceptionHandling;


import java.util.*;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("b value should not be zero");
        } catch (InputMismatchException e) {
            System.out.println("please give integer value as input");
        }
    }
}
