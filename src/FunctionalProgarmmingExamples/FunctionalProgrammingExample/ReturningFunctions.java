package FunctionalProgarmmingExamples.FunctionalProgrammingExample;

import FunctionalProgarmmingExamples.FunctionInterfaces.NoArgsFunctionExample;

import java.util.function.Function;

public class ReturningFunctions {
    // A function returning a function returning a String
    // One way of writing it
//    NoArgsFunctionExample<NoArgsFunctionExample<String>> createPrinter =
//            () -> {
//        return () -> "Hello Functional";
//    };
    protected static class MyMaths{
        public static Integer timesTwo(Integer x){
            return x * 2;
        }
        public static Integer timesThree(Integer x){
            return x * 3;
        }

        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }



    public static void main(String[] args) {
        NoArgsFunctionExample<NoArgsFunctionExample<String>> createGreeter = () -> () -> "Hello Functional";
        NoArgsFunctionExample<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        // These two methods basically do the same with the ones inside class method.
        Function<Integer, Integer> timesTwo = MyMaths.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMaths.createMultiplier(3);

        System.out.println(timesThree);
    }



}
