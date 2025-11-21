package OOPS_iitm.Week1to4;

class Shape {
    public void area() {
        System.out.println("area is unknown");
    }

    public void volume() {
        System.out.println("volume is unknown");
    }
}

class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("area of Rectangle");
    }
}

class Cube extends Shape {
    @Override
    public void area() {
        System.out.println("area of Cube");
    }

    @Override
    public void volume() {
        System.out.println("volume of Cube");
    }
}

public class FClass2 {
    public static void compute(Shape s) {
        s.area();
        s.volume();
    }

    public static void byme(Shape s) {
        System.out.println("Hi its created my Adi");
    }

    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Cube();
        compute(r);//since static to need to use object with dot operator
        compute(c);
        //rectangle is a subclass of Shape hence byMe function with Shape as a parameter can accept the subclasses
        Rectangle r1 = new Rectangle();
        byme(r1);
    }
}
