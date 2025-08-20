package OOPS;

public class InnerClasses {
    public static void main(String[] args) {
        Test adi = new Test("Aditya");
        Test tej = new Test("Tejas");

        System.out.println(Test.name);
        System.out.println(Test.name);


        System.out.println("===============================");


        Test2 adi1 = new Test2("Aditya");
        Test2 tej1 = new Test2("Tejas");

        System.out.println(adi1.name);
        System.out.println(tej1.name);
    }

    //the inner classes must be static coz if they are not they are basically depended on instances of the parent class,i.e. their object so they give error in main method while creating the object
    static class Test {
        //if you give the name parameter as static so the name remains same whenever we define the object
        static String name;

        public Test(String name) {
            Test.name = name;
        }
    }

    //the meaning of static class is that they are never depended on the main parent class object creation they are whole in their own.
    static class Test2 {
        //without static parameter this treats it as a different copy on different object creation
        String name;

        public Test2(String name) {
            this.name = name;
        }
    }
}
