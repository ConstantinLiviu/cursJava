package TemaSesiunea21Plus22;

import java.util.HashMap;
import java.util.Map;

public class HashMapComplex {
    // Create a class named HashMapComplex. In this class, create a method named getCommonEntries which takes two
    // HashMaps both with String keys and Integer values as parameters. The method should return a new HashMap
    // containing only the entries that exist in both input maps (i.e., the keys are present in both maps and
    // associated with the same values in both maps).
    HashMap<String, Integer> getCommonEntries (HashMap<String, Integer> hashMapParam1, HashMap<String, Integer>hashMapParam2) {
        HashMap<String, Integer> newHashMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry: hashMapParam1.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (hashMapParam2.containsKey(key) && hashMapParam2.get(key).equals(value)) {
                newHashMap.put(key, value);
            }
        }
        System.out.println(newHashMap);
        return newHashMap;
    }
}
