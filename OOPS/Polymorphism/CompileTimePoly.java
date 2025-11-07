package OOPS.Polymorphism;

//Compile Time Polymorphism: Decides at compile time which typ eof method to call
class CompileTimeExample {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        CompileTimeExample calc = new CompileTimeExample();
        //here the methods are decided by the type of parameter that are being added, this is called as COMPILE TIME POLYMORPHISM
        System.out.println(calc.add(2, 3));       // calls int version
        System.out.println(calc.add(2.5, 3.5));   // calls double version
        System.out.println(calc.add(1, 2, 3));    // calls 3-parameter version
    }
}

