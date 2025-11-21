package OOPS_iitm.Week1to4;

class Mammal {
    public String name;
    public int lifespan;

    public Mammal() {
        name = "Tiger";
        lifespan = 45;
    }

    public void show() {
        System.out.format("name = %s : lifespan = %d", name, lifespan);
    }

    public void display() {
        System.out.println("Mammal details");
    }
}

class Endangered extends Mammal {
    public boolean endanger_status;

    public Endangered() {
        //super(); even if it is not mentioned it is called my default so it gets the values of name and lifespan
        endanger_status = false;
    }

    public void show() {
        System.out.println("endanger status of " + this.name + " is " + endanger_status + " and lifespan is " + this.lifespan);
    }

    public void display(String species) {
        System.out.println("Endanger status");
    }
}

public class FClass4 {
    public static void main(String args[]) {
        Mammal m1 = new Endangered();
        m1.show();
        m1.display();// mammal status
        ((Endangered) m1).display("Adi"); //endanger status
    }
}

