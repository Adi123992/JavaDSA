package OPPE_Java.Quiz3;
//WILDCARD GENERIC QUESTIONS

import java.util.*;

class Rectangle<T extends Number> {
    private T length;
    private T breadth;

    public Rectangle(T len, T bre) {
        length = len;
        breadth = bre;
    }

    //Define method public double area() here
    public double area() {
        return length.doubleValue() * breadth.doubleValue();
    }

    //Define method compareArea() here
    public double compareArea(Rectangle<?> r2) {
        if (this.area() > r2.area()) {
            return this.area();
        }
        return r2.area();
    }
}

public class GenericRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle<Integer> r1 = new Rectangle<>(sc.nextInt(), sc.nextInt());
        Rectangle<Double> r2 = new Rectangle<>(sc.nextDouble(), sc.nextDouble());
        double large_area = r1.compareArea(r2);
        System.out.println(large_area);
    }
}
