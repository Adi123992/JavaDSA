package OOPS.Generics.LambdaFunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
        System.out.println("===========");
//        list.forEach((item) -> {
//            System.out.println(item * 2);
//        });
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        list.forEach(fun);

        Operation sum = (a, b) -> (a + b);
        //This is what actually happens behind the scene where we use the operate function directly without showing its implementation
//        Operation sum = new Operation() {//we know that we cannot create object of interfaces so we need to override the method and give its body declaration as well
//            @Override
//            public int operation(int a, int b) {
//                return a + b;
//            }
//        };
        System.out.println("============================");
        Operation prod = (a, b) -> (a * b);
        Operation sub = (a, b) -> (a - b);

        Lambda1 l = new Lambda1();
        System.out.println(l.operate(3, 4, prod));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    //functional interface are those which contain only 1 abstract metehod, you can either write the annotation or not its up to you
    //functional interface are applicable to be written as a labmda expression
    @FunctionalInterface
    interface Operation {
        int operation(int a, int b);
    }
}
