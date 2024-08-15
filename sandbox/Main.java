package sandbox;
import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
 public static void main(String[] args) {
    IntBinaryOperator calculator = (x, y) ->{
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      return x * y + randomNumber;
    };
    System.out.println(calculator.applyAsInt(1, 2)); 
 }
}
