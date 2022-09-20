package FunctionalProgarmmingExamples.FunctionInterfaces;

import java.util.function.Function;

public class FunctionalProgramming {
    protected static class MyMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    public static void main(String[] args) {
        // Here Function<Integer <- means the what type
        // is the first attribute of a triple function(Integer x)
        // Function<Integer, Integer> <- second one defines
        // what is returned

        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
