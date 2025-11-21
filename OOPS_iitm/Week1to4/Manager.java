package OOPS_iitm.Week1to4;

class Employee {
    public void display() {
        System.out.println("In employee class");
    }
}

class Teamlead extends Employee {
    @Override
    public void display() {
        System.out.println("in the teamlead class");
    }
}

//we cannot inherit multiple classes as java doesn tallow multiple inheritance
//public class Manager extends Employee, Teamlead {
public class Manager extends Employee {
    public static void main(String[] args) {
        //Teamlead t = new Employee(); gives error as teamlead is a subclass while the employee is the parent class
        Employee e = new Teamlead();
        e.display();

    }

    @Override
    public void display() {
        System.out.println("In manager class");
    }
}
