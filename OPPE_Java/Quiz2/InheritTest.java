package OPPE_Java.Quiz2;

//Public test case 1 (Input):
//3
//C Hyundai i10
//T WAP7i
//T WCM-2
//Output:
//Hyundai i10 has a mileage of 20km/L
//WAP7i consumes 100L/hr
//WCM-2 consumes 100L/hr

import java.util.*;

//DEFINE abstract class Vehicle
abstract class Vehicle {
    public String vehicleModel;

    public Vehicle(String model) {
        this.vehicleModel = model;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    abstract String computeMileage();
}

//DEFINE class Car
class Car extends Vehicle {

    public Car(String car) {
        super(car);
    }

    @Override
    String computeMileage() {
        return super.getVehicleModel() + " has a mileage of 20km/L";
        //or you could use
        // return  vehicleModel + " has a mileage of 20km/L";
    }
}

//DEFINE class Train
class Train extends Vehicle {
    public Train(String train) {
        super(train);
    }

    @Override
    String computeMileage() {
        return super.getVehicleModel() + " consumes 100L/hr";
    }
}

public class InheritTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();
        int numVehicles = sc.nextInt();
        for (int i = 0; i < numVehicles; i++) {
            String type = sc.next();
            if (type.equals("C")) {
                Vehicle n = new Car(sc.nextLine().trim());
                messagesList.add(n.computeMileage());
            } else if (type.equals("T")) {
                Vehicle s = new Train(sc.nextLine().trim());
                messagesList.add(s.computeMileage());
            }
        }
        for (String s : messagesList) {
            System.out.println(s);
        }
        sc.close();
    }
}
