package arraySort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        shoppingList.add("banana");
        List<String> sortedShoppingListStream = shoppingList.stream()
        .sorted()
        // .map(item -> item.toUpperCase())
        .filter(item -> item.startsWith("B"))
        .collect(Collectors.toList());

        System.out.println(sortedShoppingListStream);
        
        // System.out.println(shoppingList);
        // Stream<String> letterStream = Stream.of("a","b","c");
    }
}
