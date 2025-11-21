package OOPS_iitm.Week1to4;

class Emp {
    private int empid;
    private String name;

    public Emp(int empid_, String name_) {
        empid = empid_;
        name = name_;
    }

    public Emp() {
        this(0, "unknown");
    }

    public void print() {
        System.out.print(empid + " : " + name + " : ");
    }
}

class Mngr extends Emp {
    private String department;

    public Mngr(int empid_, String name_, String department_) {
        super(empid_, name_);
        department = department_;
    }

    public void print() {
        super.print();
        System.out.println(department);
    }
}

public class FClass5 {
    public static void main(String[] args) {
        Mngr m = new Mngr(101, "Nutan", "HR");
        m.print();
    }
}