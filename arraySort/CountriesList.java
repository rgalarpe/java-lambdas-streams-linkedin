package arraySort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesList {
    public static void main(String[] args) {
        List<String> countries =  new ArrayList<>(Arrays.asList(
            "Argentina", "Ghana", "Bangladesh", 
                "New Zealand", "Germany", "Peru", "Zimbabwe", "Guyana"));

        List<String> countryFiltered = countries.stream()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("G"))
            .filter(item -> item.length()>5)
            .collect(Collectors.toList());

        System.out.println(countryFiltered);

    }
}
