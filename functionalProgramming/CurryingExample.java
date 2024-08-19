package functionalProgramming;

import java.util.function.Function;

public class CurryingExample {

    public static void main(String[] args) {
        
        // Currying example: Breaking a 3-argument function into a series of 1-argument functions
        // The original function: (a, b, c) -> a + b + c
        
        // Step 1: Start with a curried function, where each function returns another function
        Function<Integer, Function<Integer, Function<Integer, Integer>>> curriedAdd =
            a -> b -> c -> a + b + c;  // This is the curried function

        // Step 2: Partial Application
        // Apply the first argument (3) and get a new function waiting for two more arguments
        Function<Integer, Function<Integer, Integer>> add3 = curriedAdd.apply(3);
        
        // Apply the second argument (4) and get a new function waiting for one more argument
        Function<Integer, Integer> add3And4 = add3.apply(4);

        // Finally, apply the third argument (5) to get the final result
        Integer result = add3And4.apply(5); // This will result in 3 + 4 + 5 = 12

        System.out.println("Result of curried function: " + result);  // Output: 12

        
        // Another example using direct currying
        Integer directResult = curriedAdd.apply(2).apply(3).apply(4); // 2 + 3 + 4 = 9
        System.out.println("Direct curried result: " + directResult);  // Output: 9
    }
}
