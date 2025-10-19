package OOPS_iitm;

interface Print {
    public void display();

    public default void show() {
        System.out.println("This show method can have a method body becoz of the keyword 'default'," +
                "this was done becoz of : Before Java 8, if you added a new abstract method to an interface, every existing class that implemented it would break, since it would be forced to implement the new method.");
    }
}

class Demo implements Print {
    @Override
    public void display() {
        System.out.println("As here you can see only display method is needed to be overriden and not show");
    }
}

public class InterfaceBehaviour {
    public static void main(String[] args) {
        Print p = new Demo();
        p.display();
        p.show();
    }
}
