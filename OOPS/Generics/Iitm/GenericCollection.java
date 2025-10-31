package OOPS.Generics.Iitm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

class GenericCollection {
    public static void calculateSum(Collection<? extends Number> c) {
        // Prints the sum of the numbers in the collection
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        Collection<Double> c1 = new LinkedList<>();
        c1.add(15.5);
        c1.add(25.3);
        calculateSum(c);
        calculateSum(c1);
    }
}

