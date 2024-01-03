package collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("EKO", "NICE", "OKKK"));

        NavigableSet<String> namesReversed = names.descendingSet();
         NavigableSet<String> namesSlice = names.tailSet("NICE", true);


        for (String string : namesSlice) {
            System.out.println(string);
        }

    }
}
