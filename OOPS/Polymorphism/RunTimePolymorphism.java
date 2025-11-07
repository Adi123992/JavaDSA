package OOPS.Polymorphism;

//Also called as Dynamic Method Dispatch where the actual methods that needs to be called is decided at the Runtime
class Pradeep {
    public void show() {
        System.out.println("In Pradeep show");
    }
}

class Adi extends Pradeep {
    public void show() {
        System.out.println("In Adi show");
    }
}

class Anu extends Pradeep {
    public void show() {
        System.out.println("In Anu show");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        new Pradeep().show(); // anonymous object where the object can only be used and is not referenced to a vairable
        Pradeep obj = new Adi();
        obj.show();

        //the reference variable can be reassigned to the new object forgetting the old ones
        obj = new Anu();
        obj.show();
    }
}
