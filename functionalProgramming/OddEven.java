package functionalProgramming;

import java.util.function.Function;

public class OddEven {
    public static void main(String[] args) {
        Function<Integer, String> oddEven =
            (x) -> x % 2 == 0 ? "Odd" : "Even";

        System.out.println(oddEven.apply(2));
        System.out.println(oddEven.apply(7));
    }
}
