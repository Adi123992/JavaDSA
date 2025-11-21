package OOPS_iitm.Week5to8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 12, 2);
        //Since the consumer interface has a functional Interface(single abstract method) hence it can be expressed as the Lambda Expression
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
        Consumer<Integer> con = n -> System.out.println(n);
        list.forEach(con);
    }
}
