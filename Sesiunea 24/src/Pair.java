import java.util.HashMap;

public class Pair<K,V> {
     private K key;
     private V value;
     private HashMap<K,V> pairs;

    // Create a generic method printArray which takes an array of any type and prints each element in the array.
    public <K> void printArray(K[] arrayParam) {
        for(K item: arrayParam) {
            System.out.println(item);
        }
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Pair(HashMap<K, V> pairs) {
        this.pairs = pairs;
    }
}
