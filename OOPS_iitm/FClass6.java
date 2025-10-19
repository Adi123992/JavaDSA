package OOPS_iitm;

interface Printable {
    public default void print() {// known as an extension method
        System.out.println("not implemented");// this is a deafault method once overriden after implemetation loses the content inside of the default method
    }
}

abstract class Collection {
    public void print() {
        System.out.println("no element");
    }
}

class Queue extends Collection implements Printable {
    public void print() {
        super.print();
        System.out.println("print the queue");
    }
}

public class FClass6 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.print();
    }
}

