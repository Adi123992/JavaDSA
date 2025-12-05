package OPPE_Java.OPPE2_Mock1;

//Input:
//Honda
//40
//60
//Output:
//Car Model: Honda Civic, Speed: 100.0 km/h

import java.util.*;

//Define class SpeedLimitException
class SpeedLimitException extends Exception {
    public SpeedLimitException(String msg) {
        super(msg);
    }
}

class Car {
    private String model;
    private double speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0.0;
    }

    public void accelerate(double increment) throws SpeedLimitException {
        double new_speed = speed + increment;
        if (new_speed > 120) {
            throw new SpeedLimitException("Speed limit exceeded, Max allowed is 120 km/h.");
        } else {
            speed = new_speed;
        }
// Implement the method
    }

    public String toString() {
        return "Car Model: " + model + ", Speed: " + speed + " km/h";
    }
}

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(sc.nextLine());
        try {
            myCar.accelerate(sc.nextDouble());
            myCar.accelerate(sc.nextDouble());
        } catch (SpeedLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCar);
        sc.close();
    }
}
