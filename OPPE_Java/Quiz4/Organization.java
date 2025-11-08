package OPPE_Java.Quiz4;
//Input:
//Ashok 30000.00
//Swaraj 40000.00
//Output:
//Ashok : 3000.0
//Swaraj : 6000.0

import java.util.*;

abstract class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public abstract void printBonus();
}

//********* DEFINE class Manager
class Manager extends Employee {

    public Manager(String n, double s) {
        super(n, s);
    }

    @Override
    public void printBonus() {
        System.out.println(getName() + " : " + 0.10 * getSalary());
    }
}

//********* DEFINE class Director
class Director extends Employee {

    public Director(String n, double s) {
        super(n, s);
    }

    @Override
    public void printBonus() {
        System.out.println(getName() + " : " + 0.15 * getSalary());
    }
}

public class Organization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] eArr = new Employee[2];
        eArr[0] = new Manager(sc.next(), sc.nextDouble());
        eArr[1] = new Director(sc.next(), sc.nextDouble());
        eArr[0].printBonus();
        eArr[1].printBonus();
        sc.close();
    }
}
