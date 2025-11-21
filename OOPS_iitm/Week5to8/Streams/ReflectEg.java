package OOPS_iitm.Week5to8.Streams;

import java.lang.reflect.*;
import java.util.ArrayList;

class Student {
    public static final String college = "IITM"; //Line 1
    public int rollno;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    private Student(int rollno) { //Line 2
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class ReflectEg {
    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Class c = Class.forName("Student");
        Constructor[] consts = c.getConstructors();
        Field[] fields1 = c.getFields();
        for (Constructor i : consts)
            list.add(i.toString());
        for (Field i : fields1)
            list.add(i.toString());
        for (String i : list)
            System.out.println(i);
    }
}
