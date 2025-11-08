package OPPE_Java.Mock1;

//input
//Akshay 50000 64.5
//Anasuya 60000 80.00
//Abhaya 75000 70
//output
//Akshay, 53225.0, 64.5
//Anasuya, 68000.0, 80.0
//Abhaya, 78500.0, 70.0

import java.util.*;

// Define interface Appraisable
interface Appraisable {
    default void appraisal(Teacher t) {
        t.setSalary((t.getstuPassPer() / 100) * 5000 + t.getSalary());
    }

    void checkAndUpdateSalary();
}


// Define interface SpecialAppraisable
interface SpecialAppraisable extends Appraisable {
    default void spAppraisal(Teacher t) {
        t.setSalary((t.getstuPassPer() / 100) * 10000 + t.getSalary());
    }
}

class Teacher implements SpecialAppraisable {
    private String name;
    private double salary;
    private double stuPassPer;

    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getstuPassPer() {
        return stuPassPer;
    }

    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }

    public void checkAndUpdateSalary() {
        if (stuPassPer >= 60 && stuPassPer < 75)
            appraisal(this);
        else if (stuPassPer >= 75 && stuPassPer <= 100)
            spAppraisal(this);
    }
}

public class InterfaceTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher tArr[] = new Teacher[3];
        for (int i = 0; i < tArr.length; i++)
            tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
        InterfaceTest.printUpdatedTeachList(tArr);
    }

    // Define method printUpdatedTeachList
    private static void printUpdatedTeachList(Teacher[] tArr) {
        for (int i = 0; i < tArr.length; i++) {
            tArr[i].checkAndUpdateSalary();
            System.out.println(tArr[i]);
        }
    }
}
