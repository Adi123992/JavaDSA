package OOPS.Generics;

//the extended class contains the possible generic type that can be used
public class BoundedGeneric<T extends Number> {
    T val;

    public BoundedGeneric(T val) {
        this.val = val;
    }

    public static void main(String[] args) {
        BoundedGeneric<Integer> bg = new BoundedGeneric<>(45);
        System.out.println(bg.getVal());

        BoundedGeneric<Float> bg2 = new BoundedGeneric<>(69.69f);
        System.out.println(bg2.getVal());

    }

    public T getVal() {
        return val;
    }
}
