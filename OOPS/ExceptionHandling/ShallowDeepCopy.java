package OOPS.ExceptionHandling;

import java.util.Arrays;

public class ShallowDeepCopy implements Cloneable {
    int age;
    String name;
    int[] arr;

    public ShallowDeepCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    public ShallowDeepCopy(ShallowDeepCopy s) {
        this.age = s.age;
        this.name = s.name;
        this.arr = s.arr; // this is a shallow copy (same array reference)
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowDeepCopy s1 = new ShallowDeepCopy(36, "Adi");
        ShallowDeepCopy s2 = new ShallowDeepCopy(s1);
        System.out.println(Arrays.toString(s1.arr));
        System.out.println(Arrays.toString(s2.arr));
        s1.arr[1] = 15;
        System.out.println(Arrays.toString(s1.arr));//shallow copy
        System.out.println(Arrays.toString(s2.arr));//shallow copy
//deep copy
        ShallowDeepCopy s3 = (ShallowDeepCopy) s1.clone();
        s1.arr[0] = 9;
        System.out.println(Arrays.toString(s1.arr));
        System.out.println(Arrays.toString(s3.arr));

    }

    //1st method
//    public Object clone() throws CloneNotSupportedException {
//        //this is a deep copy
//        ShallowDeepCopy other = (ShallowDeepCopy) super.clone();//actually a shallow copy
//        other.arr = new int[this.arr.length];
//        for (int i = 0; i < this.arr.length; i++) {
//            other.arr[i] = this.arr[i];
//        }
//        return other;
//
//    }
    //2nd method
    public Object clone() throws CloneNotSupportedException {
        //this is a deep copy
        ShallowDeepCopy other = (ShallowDeepCopy) super.clone();//actually a shallow copy
        other.arr = this.arr.clone();

        return other;

    }
}
