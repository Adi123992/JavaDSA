package OOPS_iitm;

class Polygon {
    public void perimeter() {
        System.out.print("In Polygon perimeter");
    }

    public void angleSum() {
        System.out.println("In Polygon angleSum");
    }
}

public class Pentagon extends Polygon {
    @Override
    public void perimeter() {
        System.out.println("In Pentagon perimeter");
    }

    //@Override gives error becoz it is not overriden it has parameter while the plygon method doesnt
    public void angleSum(int x) {
        System.out.println("In Pentagon angleSum");
    }
}
