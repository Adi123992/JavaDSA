package OOPS.Miscellaneous;

interface Shape {
    default void draw() {
        System.out.println("Draw shape");
    }
}

class Circle implements Shape {
//since shape contains dfault method no need to implement it 
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}

public class Interface1 {
}
