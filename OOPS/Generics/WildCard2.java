package OOPS.Generics;

import java.util.Arrays;

//<?> is called as wildcard generic which is defined for deciding a paramter type or similar things to choose an paramteer type within the range
public class WildCard2<T> {
    T[] list;

    public WildCard2(T[] list) {
        this.list = list;
    }

    public static void main(String[] args) {
        String[] countries = {"India", "Brazil", "Canada", "USA", "Europe"};
        String[] names = {"a", "b", "c", "d"};
        Integer[] scores = {85, 65, 78, 98, 69};
        //this is called as raw declaration where we do not mention the varible generic
        //WildCard2 t3 = new WildCard2<>(scores);
        WildCard2<String> t1 = new WildCard2<String>(countries);
        WildCard2<String> t2 = new WildCard2<String>(names);
        WildCard2<Integer> t3 = new WildCard2<Integer>(scores);

        System.out.println(Arrays.toString(t2.getList()));
        System.out.println(t2.list.length);
        t1.greaterThan(t3);
        //t1.greaterThan(t2);
    }

    public T[] getList() {
        return list;
    }

    public void greaterThan(WildCard2<? extends Number> temp) {
        if (list.length > temp.list.length) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
