package OOPS.AbstractionInterfaces;

class A2 {
    public void show() {
        System.out.println("In A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            //anonymous inner class
            @Override
            public void show() {
                System.out.println("In new show");
            }
        };
        a.show();
    }
}
