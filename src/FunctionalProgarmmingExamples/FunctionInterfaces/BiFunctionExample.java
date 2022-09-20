package FunctionalProgarmmingExamples.FunctionInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x,y) -> x + y;
        System.out.println(add.apply(32,32));
        //Result: 64
    }


}
