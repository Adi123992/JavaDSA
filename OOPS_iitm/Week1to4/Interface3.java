package OOPS_iitm.Week1to4;

interface NumberType {
    public static void print(double x) {
        System.out.println("norm is : " + x);
    }

    public double norm();
}

class ComplexNum implements NumberType {
    private int r, i;

    public ComplexNum(int r_, int i_) {
        r = r_;
        i = i_;
    }

    public double norm() {
        return Math.sqrt(r * r + i * i);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        ComplexNum c = new ComplexNum(3, 4);
        NumberType.print(c.norm());//the static method is called via the name of the class as we cannot create an object for calling a static method
    }
}
