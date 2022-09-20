package FunctionalProgarmmingExamples.FunctionalProgrammingExample;

import java.util.function.BiFunction;

public class PassingFunctionsAsArguments {
    protected static class MyMaths{
        public static Integer add(Integer x, Integer y){
            return x + y;
        }
        public static Integer subtract(Integer x, Integer y){
            return x - y;
        }
        public static Integer combine2and3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }
    public static void main(String[] args) {
        // Passing functions as data to another function
        System.out.println(MyMaths.combine2and3(MyMaths::add));
        System.out.println(MyMaths.combine2and3(MyMaths::subtract));
    }
}
