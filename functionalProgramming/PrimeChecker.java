package functionalProgramming;

import java.util.function.Function;

public class PrimeChecker {
    public static void main(String[] args) {
        Function<Integer, Boolean> isPrime = (x) -> {
            return x > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(x)+1)
            .noneMatch(i -> x % i ==0);
        };
        System.out.println(isPrime.apply(2));  // Output: true
        System.out.println(isPrime.apply(4));  // Output: false
        System.out.println(isPrime.apply(13)); // Output: true
        System.out.println(isPrime.apply(18)); // Output: false
    }

}
