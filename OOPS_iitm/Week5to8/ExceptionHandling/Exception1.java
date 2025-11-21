package OOPS_iitm.Week5to8.ExceptionHandling;

public class Exception1 {
    String msg = null;

    public static void main(String[] args) {
        Exception1 e = new Exception1();
        e.show();
    }

    public void show() {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                msg = e.getMessage(); //Line 1
            }
            try {
                System.out.println("IITM".charAt(5));
            } catch (StringIndexOutOfBoundsException e) {
                msg = e.getMessage(); //Line 2
            }
        } finally {
            System.out.println(msg);
        }
    }
}
