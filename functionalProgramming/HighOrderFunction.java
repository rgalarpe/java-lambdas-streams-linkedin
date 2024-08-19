package functionalProgramming;
import java.util.function.Function;
import java.util.function.BiFunction;

public class HighOrderFunction {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
        (func) -> (x, y) -> {
            if (x == 0f) {
                System.out.println("Error: first argument is zero!");
                return 0f; 
            }
            if (y == 0f) {
                System.out.println("Error: second argument is zero!");
                return 0f; 
            }
            return func.apply(x, y);  
        };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(5f, 2f));
    }
}
