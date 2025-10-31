package OOPS.Generics;

public class GenericIntro<T> {
    T val;

    public GenericIntro(T val) {
        this.val = val;
    }

    public static void main(String[] args) {
        GenericIntro<Integer> genericIntro = new GenericIntro<>(4);
        System.out.println(genericIntro.getVal());

        GenericIntro<String> genericIntro2 = new GenericIntro<>("Adiii");
        System.out.println(genericIntro2.getVal());
    }

    public T getVal() {
        return val;
    }
}
