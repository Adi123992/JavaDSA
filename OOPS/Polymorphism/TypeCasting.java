package OOPS.Polymorphism;

class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        //dynamic method dispatch
        A obj = new B();//object of B created in which the reference variable is of type A
        obj.show1();//this is calling the method of parent class so this is called as UPCASTING
        //where the object is by default A obj = (A) new B();
        //DOWNCASTING
        B obj1 = (B) obj;
        obj1.show2();//here the A type of object reference variable is casted down to B type
        //can be also done as ((B)obj).show2;
    }
}
