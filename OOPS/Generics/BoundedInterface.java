package OOPS.Generics;

interface Car {
    void startEngine();

    void stopEngine();
}

class Ford implements Car {

    @Override
    public void startEngine() {
        System.out.println("Started Ford");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped Ford");
    }
}

class Maruti implements Car {

    @Override
    public void startEngine() {
        System.out.println("Started Maruti");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped Maruti");
    }
}

class Suzuki {
    public void start() {
        System.out.println("Suzuki started");
    }
}

public class BoundedInterface<T extends Car> {
    T val;

    public BoundedInterface(T val) {
        this.val = val;
    }

    public static void main(String[] args) {
        BoundedInterface<Ford> bi = new BoundedInterface<>(new Ford());
        BoundedInterface<Maruti> bi2 = new BoundedInterface<>(new Maruti());
        //BoundedInterface<Suzuki> bi3 = new BoundedInterface<>(new Suzuki());
        //error becoz it is a not Car type

    }

    public T getVal() {
        return val;
    }

}
