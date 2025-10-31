package OOPS.Generics.Iitm;

class Display {
    public <T extends Number> void show(T value) { // LINE 1
        System.out.println("Number: " + value);
    }

    public <U extends Integer> void show(U value) { // LINE 2
        System.out.println("Integer: " + value);
    }
}

public class NumberGeneric {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);
        d.show(5.5);
    }
}
