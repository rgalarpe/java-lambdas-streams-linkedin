package functionalProgramming;

public class Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Shaun";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
        //System.out.println(name); this one will not read because of a closure
    }
}
