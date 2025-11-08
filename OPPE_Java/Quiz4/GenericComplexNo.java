package OPPE_Java.Quiz4;

import java.util.*;

//Public test case 1:
//Input:
//6 10
//10.3 15.6
//Output:
//6.0 + 10.0i + 10.3 + 15.6i = 16.3 + 25.6i

//DEFINE class ComplexNum
class ComplexNum<T extends Number> {
    private T r;
    private T i;


    public ComplexNum(T n1, T n2) {
        r = n1;
        i = n2;
    }

    public ComplexNum<Double> add(ComplexNum<?> c2) {
        ComplexNum<Double> dc = new ComplexNum<>(0.0, 0.0);
        dc.r = this.r.doubleValue() + c2.r.doubleValue();
        dc.i = this.i.doubleValue() + c2.i.doubleValue();
        return dc;
    }

    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

public class GenericComplexNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}

