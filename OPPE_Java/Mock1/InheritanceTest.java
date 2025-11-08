package OPPE_Java.Mock1;
//input
//Srihari 50000
//Vishnu 80000 laxmi
//output
//Srihari, 50000.0
//Srihari, 50000.0, bonus = 5000.0
//Vishnu, 80000.0, laxmi
//Vishnu, 80000.0, laxmi, 4000.0

import java.util.Scanner;

class Faculty {
    private String name;
    private double salary;

    public Faculty(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double bonus(float percent) {
        return (percent / 100.0) * salary;
    }

    // Define method getDetails()
    public String getDetails() {
        return name + ", " + salary;
    }

    // Override method getDetails(float percent)
    public String getDetails(float percent) {
        return name + ", " + salary + ", bonus = " + bonus(percent);
    }
}

class Hod extends Faculty {
    private String personalAssistant;

    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }

    // Override method bonus(float percent)
    public double bonus(float percent) {
        return 0.5 * super.bonus(percent);
    }

    // Override method getDetails()
    public String getDetails() {
        return super.getDetails() + ", " + personalAssistant;
    }

    // Override method getDetails(float percent)
    public String getDetails(float percent) {
        return super.getDetails() + ", " + personalAssistant + ", " + bonus(percent);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}
