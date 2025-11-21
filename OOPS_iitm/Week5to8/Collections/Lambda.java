package OOPS_iitm.Week5to8.Collections;

import java.util.*;

//functional interface : converted to Lambda experssion when called
interface ArrOperations<T extends Number> {
    public abstract void display(T[] arr);
}

public class Lambda {
    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        a[0] = 12;
        a[1] = 13;
        a[2] = 14;
        //
        ArrOperations<Integer> arr = (s) -> {
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i] + 2 + " ");
            }
        };
        arr.display(a);
    }
}
