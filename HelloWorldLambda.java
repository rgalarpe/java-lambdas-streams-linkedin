// Define a functional interface with a single abstract method
interface Greeting {
    void sayHello();
}

public class HelloWorldLambda {
    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        Greeting greeting = () -> System.out.println("Hello, World!");
        
        greeting.sayHello();
    }
}
