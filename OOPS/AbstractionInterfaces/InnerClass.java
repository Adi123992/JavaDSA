package OOPS.AbstractionInterfaces;

//the classes that are declared within an existing class is called as a INNER CLASS
class A {
    public void show() {
        System.out.println("In show");
    }

    class B {
        public void fun() {
            System.out.println("In fun");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        //as for calling a non-static method we need to create an object that class
        //similarly for accessing a class inside a class first we need to create an object of the outer class and then create INNER class's object using the obj variable of the Outer class
        A.B b = a.new B();
        b.fun();
    }
}
