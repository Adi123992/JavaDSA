package OOPS.Miscellaneous;

public class StaticBlock {
    static int a = 4;
    static int b;

    // it is a static block which is going to execute just once when the first object is created in the main method
    static {
        System.out.println("Im a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        //sincce the variables are static we need to call them using the name of class with "." operator
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

