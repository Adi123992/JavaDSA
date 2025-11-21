package OOPS_iitm.Week1to4;

abstract class Vehicle {
    abstract void start();//this is an abstract method

    void info() {
        System.out.println("This is a concrete method");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Abstract method overriden");
    }

    @Override
    void info() {
        System.out.println("Not necesaary to be overriden");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Abstract method overriden");
    }
}

public class AbstractBehaviour {

    //we cannot create the object of an abstract class becoz it is incomplete by nature already
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.info();
        v.start();// object of vehicle created
    }
}
//Cannot create objects: Abstract classes like Vehicle or Payment serve as blueprints; you instantiate subclasses like Car or CreditPayment.
//
//Abstract + Concrete methods: Can have abstract void start() (must implement) and void info() (can reuse as-is) in the same class.
//
//Concrete subclass rules: Subclasses must override abstract methods but can choose to override concrete ones.
//
//Code reuse: Shared behavior like void info() or void validateUser() avoids rewriting the same code in every subclass.
//
//Enforces structure: Forces all subclasses to implement required actions (e.g., start() in all vehicles, makePayment() in all payment types).