package OOPS.Generics;

import java.util.Arrays;

//here in this program we will understand why do we need wildcard generic
public class WildCard<T> {
    T[] list;

    public WildCard(T[] list) {
        this.list = list;
    }

    public static void main(String[] args) {
        String[] countries = {"India", "Brazil", "Canada", "USA", "Europe"};
        String[] names = {"a", "b", "c", "d"};
        Integer[] scores = {85, 65, 78, 98, 69};
        WildCard t1 = new WildCard<String>(countries);
        WildCard t2 = new WildCard<String>(names);
        WildCard t3 = new WildCard<Integer>(scores);

        System.out.println(Arrays.toString(t2.getList()));
        System.out.println(t2.list.length);
        t1.greaterThan(t3);
        t1.greaterThan(t2);
    }

    public T[] getList() {
        return list;
    }

    public void greaterThan(WildCard<T> temp) {
        if (list.length > temp.list.length) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
