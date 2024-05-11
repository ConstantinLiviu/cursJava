import java.util.*;
import java.util.stream.Collectors;

public class TemaSesiunea29Plus30 {
    // For a list of strings, create a method that filters out strings with fewer than 5 characters, then converts
    // each string to uppercase, and finally sorts them in reverse order.

    public static ArrayList<String> filterAndSort(ArrayList<String> arrListParam) {
        ArrayList<String> filteredArray =
                arrListParam.stream().filter(s->s.length()>=5).map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> sortedArray = new ArrayList<>();
        for(int i =filteredArray.size()-1; i>=0; i--) {
            sortedArray.add(filteredArray.get(i));
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>(List.of("mere", "prune", "apa", "ciment", "ie", "autobuz",
                "sare", "harpon"));

        System.out.println(filterAndSort(stringsList));

    }
}
