package OOPS.AbstractionInterfaces;

abstract class P {
    public abstract void show1();
}

public class AbstractAnnInnerClass {
    public static void main(String[] args) {
        //since A is an abstract class so we cannot create an object of it, the object is of the ANONYMOUS INNER CLASS
        P a = new P() {
            @Override
            public void show1() {
                System.out.println("in show ");
            }
        };
        a.show1();
    }
}
