package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("Diar");
        names.add("Ihza");
        names.add("Saputra");
        names.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : names) {
            System.err.println(value);
        }

        System.out.println("REMOVE");

        names.remove("Diar");

        for (var value : names) {
            System.err.println(value);
        }

        System.out.println(
            names.contains("Ihza")
        );

          System.out.println(
            names.containsAll(List.of("Ihza", "Programmer"))
        );


    }
}
