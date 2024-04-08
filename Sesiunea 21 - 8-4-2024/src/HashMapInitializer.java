import java.util.HashMap;

public class HashMapInitializer {
    HashMap<String, Integer>  initializeMap() {
        HashMap<String, Integer> newHashMap = new HashMap<>();
        newHashMap.put("One", 1);
        newHashMap.put("Two", 2);
        newHashMap.put("Three", 3);
        System.out.println(newHashMap);
        return newHashMap;
    }
}
