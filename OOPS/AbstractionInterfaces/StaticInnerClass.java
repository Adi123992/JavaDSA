package OOPS.AbstractionInterfaces;

class A1 {
    public void show() {
        System.out.println("In show");
    }

    static class B1 {
        public void fun() {
            System.out.println("In fun");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();
        //if the class is static then we just need to pass the class name along with the inner class
        A1.B1 obj1 = new A1.B1();
        obj1.fun();
    }
}
