import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Given a List of strings, find which of them(strings) have duplicates and how many duplicates each string
        // has. Store this information in a HashMap where the key is the string and the value is the count of occurrences.
        // Print the resulting map.

        List<String> strings = List.of("apple", "banana", "apple", "orange", "banana", "grape", "apple", "orange");
        HashMap<String, Integer> counterInstante = new HashMap<>();
        for (String string: strings) {
            if (!counterInstante.containsKey(string)) {
                counterInstante.put(string, 1);
            } else {
                counterInstante.put(string, counterInstante.get(string)+1);
            }
        }
        System.out.println(counterInstante);
    }
}