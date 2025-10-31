package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private static int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
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
        CustomArrayList clist = new CustomArrayList();
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
        int[] temp = new int[data.length * 2];
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

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;

    }

}
