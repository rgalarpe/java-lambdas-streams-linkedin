package arraySort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;;

public class ShoppingList {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80,66,73,92,43};
        Stream<Integer> scoresStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shoppingListStream = shoppingList.stream();
        
        shoppingListStream.sorted()
        .forEach(item -> System.out.println(item));
        
        Stream<String> letterStream = Stream.of("a","b","c");
    }
}
