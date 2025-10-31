package OOPS.Generics.Iitm;

abstract class Vehicle {
    abstract void capacity();
}

class Bike extends Vehicle {
    private String count = "Bike capacity at most 2 persons";

    @Override
    public void capacity() {
        System.out.println(count);
    }
}

class Auto extends Vehicle {
    private String count = "Auto capacity at most 4 persons";

    @Override
    public void capacity() {
        System.out.println(count);
    }
}

public class Capacity {
    public static void main(String[] args) {
        Capacity bike = new Capacity();
        bike.seating(new Bike());
        Capacity auto = new Capacity();
        auto.seating(new Auto());
    }

    public <T extends Vehicle> void seating(T obj) {
        obj.capacity();
    }
}