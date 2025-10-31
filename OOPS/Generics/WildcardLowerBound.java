package OOPS.Generics;

import java.util.Arrays;

public class WildcardLowerBound<T> {
    T[] list;

    public WildcardLowerBound(T[] list) {
        this.list = list;
    }

    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "d"};
        Integer[] scores = {85, 65, 78, 98, 69};
        WildcardLowerBound<String> t1 = new WildcardLowerBound<>(names);
        WildcardLowerBound<Integer> t2 = new WildcardLowerBound<>(scores);

        t1.greaterThan(t2);//t2 is of Integer type
        //t2.greaterThan(t1);//t1 is of String type
    }

    public T[] getList() {
        return list;
    }

    //lower bounds which have minimal Subclasses eg: Integer
    public void greaterThan(WildcardLowerBound<? extends Integer> temp) {
        if (list.length == temp.list.length) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
