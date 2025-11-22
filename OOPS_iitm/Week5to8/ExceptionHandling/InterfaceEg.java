package OOPS_iitm.Week5to8.ExceptionHandling;


interface Deliverable {
    public static void status() {
        System.out.println("Delivery status");

    }

    public default void deliver() {
        System.out.println("Order delivered");

    }

}

interface Trackable {
    public static void status() {
        System.out.println("Tracking status");

    }

    public default void track() {
        System.out.println("Tracking order");

    }
}

class FoodOrder implements Deliverable, Trackable {
    public void deliver() {
        System.out.println("Delivered successfully");

    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        Deliverable o1 = new FoodOrder();
        o1.deliver();
        //o1.track();//error becoz tracl doesnt belong to interface Deliverable
        Deliverable.status(); //LINE-1
        Trackable.status();//LINE-2
    }
}
