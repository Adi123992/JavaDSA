package OPPE_Java.OPPE2_Mock1;

//Input:
//anuska 7.9 70000
//ram 9.8 250000
//geetha 9.1 90000
//riya 8.5 90000
//Output:
//anuska : 7.9 : 70000.0 : grade-2 scholarship
//geetha : 9.1 : 90000.0 : grade-1 scholarship
//riya : 8.5 : 90000.0 : grade-2 scholarship

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.*;

class Student {
    private String name, scholarshipStatus;
    private double avgCGPA, income;

    public Student(String n, double a, double i) {
        name = n;
        avgCGPA = a;
        income = i;
        scholarshipStatus = "not eligible";
    }

    public String toString() {
        return name + " : " + avgCGPA + " : "
                + income + " : " + scholarshipStatus;
    }

    public double getAvgCGPA() {
        return avgCGPA;
    }

    public double getIncome() {
        return income;
    }

    public void setScholarshipStatus(String ss) {
        scholarshipStatus = ss;
    }
}

public class Stream1 {
    //Define method getEligibleStream here
    public static Stream<Student> getEligibleStream(List<Student> studentList) {
        Stream<Student> student = studentList.stream().filter(s -> s.getAvgCGPA() > 7.5 && s.getIncome() < 100000);
        return student;
    }

    //Define method updateScholarshipStatus here
    public static void updateScholarshipStatus(List<Student> studentList) {
        for (Student s : studentList) {
            if (s.getAvgCGPA() > 9.0) {
                s.setScholarshipStatus("grade-1 scholarship");
            } else {
                s.setScholarshipStatus("grade-2 scholarship");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sList = new ArrayList<Student>();
        Student s;
        for (int i = 0; i < 4; i++) {
            s = new Student(sc.next(), sc.nextDouble(), sc.nextDouble());
            sList.add(s);
        }
        List<Student> eList = getEligibleStream(sList).collect(Collectors.toList());
        updateScholarshipStatus(eList);
        for (Student es : eList)
            System.out.println(es);
        sc.close();
    }
}
