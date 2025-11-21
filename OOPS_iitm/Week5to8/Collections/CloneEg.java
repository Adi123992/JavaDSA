package OOPS_iitm.Week5to8.Collections;

class Department implements Cloneable {
    String name;

    public Department(String n) {
        name = n;
    }

    public Department clone() throws CloneNotSupportedException {
        return (Department) super.clone();
    }
}

class University implements Cloneable {
    Department dept;
    String Uname;

    public University(Department d, String n) {
        dept = d;
        Uname = n;
    }

    public University clone() throws CloneNotSupportedException {
        University u = (University) super.clone();//clone method is of object type so we need to typecast it everytime using for some class
        u.dept = dept.clone();
        return u;
    }

    public String toString() {
        return Uname + ":" + dept.name;
    }
}

public class CloneEg {
    public static void main(String[] args) {
        University u1 = new University(new Department("cse"), "xyz");
        try {
            University u2 = u1.clone();
            u2.dept.name = "ece";
            System.out.println(u1 + "," + u2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
