package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericDemo1<T> {

    private static int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericDemo1() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(45);
        list.add(69);
        System.out.println(list.get(1));
        list.set(1, 36);
        System.out.println(list.remove(0));
        System.out.println(list);
        //now we created our own customArraylist with its method similar to ArrayList
        System.out.println("====================================");
        GenericDemo1 clist = new GenericDemo1();
        clist.add(45);
        clist.add(55);
        clist.add(65);
        clist.add(75);
        System.out.println(clist.get(2));
        System.out.println(clist);

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void add(int ele) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = ele;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        if (isFull()) {
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;

    }

}
