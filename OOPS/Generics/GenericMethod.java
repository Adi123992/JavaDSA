package OOPS.Generics;

public class GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.open();
        gm.printMe("Hello");
        gm.printMeAgain(45.55f);
    }

    public void open() {
        System.out.println("Opening the class soon");
    }

    public <T> void printMe(T num) {
        System.out.println(num);
    }

    public <U extends Number> void printMeAgain(U num) {
        System.out.println(num);
    }
}
