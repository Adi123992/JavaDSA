package OPPE_Java.Quiz1;


import java.util.Scanner;

class AirPlane {
    private String model;

    public AirPlane(String n) {
        model = n;
    }

    // Define method display

    public void display() {
        System.out.println("Inside an anonymous airplane");
    }

    // Define an accessor method
    public String getModel() {
        return model;
    }
}

// Define class Boeing
class Boeing extends AirPlane {
    public Boeing(String n) {
        super(n);
    }

    public void display() {
        System.out.println("Inside Boeing " + getModel());
    }
}

// Define class Airbus
class AirBus extends AirPlane {
    public AirBus(String n) {
        super(n);
    }

    public void display() {
        System.out.println("Inside AirBus " + getModel());
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirPlane[] aPlanes = new AirPlane[3];
        aPlanes[0] = new AirPlane("");
        aPlanes[1] = new Boeing(sc.nextLine());
        aPlanes[2] = new AirBus(sc.nextLine());
        aPlanes[0].display();
        aPlanes[1].display();
        aPlanes[2].display();
        sc.close();
    }
}
//Public test case (Input):
//737 MAX
//A220
//Output:
//Inside an anonymous airplane
//Inside Boeing 737 MAX
//Inside AirBus A220