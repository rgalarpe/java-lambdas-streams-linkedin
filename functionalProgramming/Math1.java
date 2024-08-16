package functionalProgramming;

import java.util.function.Function;

public class Math1 {
    protected static class MyMath{
        public static Integer triple(Integer x){
            return x * 3;
        }
    }
    public static void main (String[] args){
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(12);
        System.out.println(result);
    }

}
