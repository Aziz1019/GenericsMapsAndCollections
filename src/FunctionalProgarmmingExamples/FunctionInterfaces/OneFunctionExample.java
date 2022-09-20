package FunctionalProgarmmingExamples.FunctionInterfaces;

import java.util.function.Function;

public class OneFunctionExample {
    public static void main(String[] args) {
//FirstWay
        //        Function<Integer, Integer> absoluteValue =
//                (x) -> x < 0 ? -x : x;
// Second Way
        Function<Integer, Integer> absoluteValue = (x) -> {
            if(x < 0)
                return -x;
            else
                return x;
        };
        System.out.println(absoluteValue.apply(5));
        // Result: 5
    }
}
