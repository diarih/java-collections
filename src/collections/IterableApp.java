package collections;

import java.util.List;

/**
 * IterableApp
 */
public class IterableApp {

    public static void main(String[] args) {
        
        Iterable<String> names = List.of("Eko", "Banu", "Ladu");

        for (var name : names) {
            System.out.println(name);
        }
        
    }
}