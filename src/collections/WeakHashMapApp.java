package collections;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * WeakHashMapApp
 */
public class WeakHashMapApp {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>(); // For Caching only
        
        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }
        System.gc(); // garbage collector
        System.out.println(map.size());
    }
}