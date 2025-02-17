package maelton.java_functional_programming.common_functional_interfaces.function;

import java.util.List;
import java.util.function.Function;

/**
 * Function<T,R> Represents a function that accepts one argument and produces a result.
 *
 * public interface Function<T, R> {
 *     R apply(T t);
 * }
 */
public class FunctionFunctionalInterfaceExample {
    private static Function<Integer, List<Integer>> integerListFunction;

    public static void main(String[] args) {
        Function<Integer, Integer> incrementNumber = n -> n + 1;
        System.out.println(incrementNumber.apply(5));

    }
}
