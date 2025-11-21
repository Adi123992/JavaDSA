package OOPS_iitm.Week5to8.Collections;

import java.util.*;

class Vehicle implements Comparable<Vehicle> {
    int wheels;

    public Vehicle(int n) {
        wheels = n;
    }

    public int compareTo(Vehicle v) {
        if (wheels < v.wheels)
            return 1;
        else if (wheels > v.wheels)
            return -1;
        else return 0;
    }

    public String toString() {
        return "" + wheels;
    }
}

public class ComparableEg {
    public static void main(String args[]) {
        Set<Vehicle> veh = new TreeSet<>();
        veh.add(new Vehicle(4));
        veh.add(new Vehicle(2));
        veh.add(new Vehicle(6));
        veh.add(new Vehicle(1));
        for (Vehicle v : veh) {
            System.out.print(v + " ");
        }
    }
}
