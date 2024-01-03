package collections.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Viktor");
        mutable.add("Pamulang");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Mantab", "Jiwa", "Yeah");
    }
}
