package OOPS_iitm.Week1to4;

class Bird {
    public void fly() {
        System.out.println("it can fly");
    }
}

class Duck extends Bird {
    public void swim() {
        System.out.println("it can swim");
    }
}

public class FClass {
    public static void doIt(Bird b) {
        b.fly();
        //It checks at runtime whether the actual object referenced by variable b
        //is an instance of the class Duck (or a subclass of Duck). so DUCK is acutally
        //a subclass of Bird hence it returns strue
        if (b instanceof Duck)
            //the object of Bird i.e b doesnt have a method called swim so we need to typecast it as given
            ((Duck) b).swim();

    }

    public static void main(String[] args) {
        //Duck d = new Duck(); actual that was given
        Bird b = new Duck();//this works too
        doIt(b);
    }
}