package OOPS.Generics;

public class GenericMultipleParameter<U, V> {
    U val1;
    V val2;

    public GenericMultipleParameter(U val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public static void main(String[] args) {
        GenericMultipleParameter<String, Integer> mp = new GenericMultipleParameter<>("Adiiii", 96);
        System.out.println(mp.getVal1() + " : " + mp.getVal2());

        GenericMultipleParameter<String, Number> mp2 = new GenericMultipleParameter<>("Anuu", 99.96);
        System.out.println(mp2.getVal1() + " : " + mp.getVal2());
    }

    public U getVal1() {
        return val1;
    }

    public V getVal2() {
        return val2;
    }
}
