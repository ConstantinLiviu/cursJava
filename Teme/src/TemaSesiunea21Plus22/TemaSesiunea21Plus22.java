package TemaSesiunea21Plus22;

import java.util.HashMap;
import java.util.Map;

public class TemaSesiunea21Plus22 {
    public static void main(String[] args) {
        // Finding Common Entries in Two HashMaps
        // Description:
        // Create a class named HashMapComplex. In this class, create a method named getCommonEntries which takes two
        // HashMaps both with String keys and Integer values as parameters. The method should return a new HashMap
        // containing only the entries that exist in both input maps (i.e., the keys are present in both maps and
        // associated with the same values in both maps).

        HashMap<String,Integer> firstHashMap = new HashMap<>(Map.of("Key1", 8, "Key2", 10, "Key3", 3, "Key4", 11));
        HashMap<String,Integer> secondHashMap = new HashMap<>(Map.of("Key1", 8, "Key9", 10, "Key46", 99, "Key11", 7,
                "Key4", 11));

        HashMapComplex commonKeyValuePairs = new HashMapComplex();
        commonKeyValuePairs.getCommonEntries(firstHashMap, secondHashMap);
    }
}
