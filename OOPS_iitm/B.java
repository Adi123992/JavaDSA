package OOPS_iitm;

class A {
    public void display() {
        System.out.print("Hi");
    }
}

public class B extends A {
    public static void main(String[] args) {
        A a = new B();
        //a.display("Adi"); this wont work beacuse a obj is of class A and A doesnt has any parameterized function in it so we need to cast it
        ((B) a).display("Adi");
    }

    public void display(String s) {
        display();
        System.out.print(" " + s);
    }
}
