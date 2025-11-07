package OOPS.ExceptionHandling;

public class ExcepIntro {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //divide(a, b);
            //you can even thorw exception from this block as well
            //throw new Exception("Just for fun");
            String name = "Aditya";
            if (name.equals("Aditya")) {
                throw new CustomException("This is " + name);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception x) {
            System.out.println(x.getMessage());
        } finally {
            System.out.println("Executed no matter what");
        }
        //just to check functionality
        System.out.println(ExcepIntro.divide(15, 5));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dont do this");
        } else {
            return a / b;
        }
    }
}
