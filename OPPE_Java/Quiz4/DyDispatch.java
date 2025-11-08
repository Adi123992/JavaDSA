package OPPE_Java.Quiz4;

//Input:
//BMW
//Giant
//Output:
//This is a generic vehicle.
//This is a car named BMW.
//This is a bicycle named Giant.

import java.util.Scanner;

class Vehicle {
    private String name;

    public Vehicle(String n) {
        name = n;
    }

    // Define method display
    public void display() {
        System.out.println("This is a generic vehicle.");
    }

    // Define an accessor method
    public String getName() {
        return name;
    }
}

//Define class Car
class Car extends Vehicle {

    public Car(String n) {
        super(n);
    }

    public void display() {
        System.out.println("This is a car named " + getName() + ".");
    }
}

//Define class Bicycle
class Bicycle extends Vehicle {

    public Bicycle(String n) {
        super(n);
    }

    public void display() {
        System.out.println("This is a bicycle named " + getName() + ".");
    }
}

public class DyDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("");
        vehicles[1] = new Car(sc.nextLine());
        vehicles[2] = new Bicycle(sc.nextLine());
        for (Vehicle v : vehicles) {
            v.display();
        }
        sc.close();
    }
}