package FunctionalProgarmmingExamples.FunctionInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MultiFunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> absoluteValue =
        (x) -> x < 0 ? -x : x;

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(32,32));
        //Result: 64


        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(2,2,2));
        //Result: 6

        NoArgsFunctionExample<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());
        //Result: Hello!


    }
}
