package OOPS_iitm.Week1to4;


interface Shape1 {
    public double area();

    public default double volume() {
        return -1.0;
    }
}

interface Printable1 {
    public default void print() {
        System.out.println("not implemented");
    }
}

class Rectangle1 implements Shape1, Printable1 {
    private double w, h;

    public Rectangle1(double w_, double h_) {
        w = w_;
        h = h_;
    }

    public double area() {
        return w * h;
    }

    public void print() {
        System.out.print(area() + " ");
        System.out.print(volume());
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Printable1 s = new Rectangle1(20.0, 50.0);
        s.print();
    }
}