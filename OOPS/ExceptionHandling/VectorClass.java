package OOPS.ExceptionHandling;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        //Vector is a synchronized dynamic array, making it slower but safe in multi-threaded environments.
        //ArrayList grows by 50%, while Vector grows by 100% (doubles).
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(40);
        vector.add(50);
        System.out.println(vector);
    }
}
