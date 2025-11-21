package OOPS_iitm.Week1to4;

//NOTE : Interfaces can extend each other but classes can only implement them, while the classes
// can extend each other

interface One {
    void print();
}

interface Two extends One {
    void display();
}

class Three implements Two {
    public void display() {
        System.out.println("This is display");
    }

    @Override
    public void print() {
        System.out.println("this is print");
    }
}

public class InterfaceExtends {
    public static void main(String[] args) {
        Three three = new Three();
        three.display();
    }
}

