package OPPE_Java.Quiz2;

import java.util.*;

class Customer {
    String name;
    String[] items;

    public Customer(String name, String[] items) {
        this.name = name;
        this.items = items;

    }

    public Customer(Customer c) {
        this.name = c.name;
        this.items = c.items.clone();
    }

    public void setItem(int index, String itm) {
        items[index] = itm;
    }

    public String getName() {
        return name;
    }

    //***** Define required constructor(s) here
    public void setName(String n) {
        name = n;
    }

    public String getItem(int indx) {
        return items[indx];
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] itms = {"Eggs", "Noodles", "Bread"};
        Customer c1 = new Customer("c1", itms);
        Customer c2 = new Customer(c1);
        c2.setName(sc.next());
        c2.setItem(1, sc.next());
        System.out.println(c1.getName() + ": " + c1.getItem(1));
        System.out.println(c2.getName() + ": " + c2.getItem(1));
    }
}
