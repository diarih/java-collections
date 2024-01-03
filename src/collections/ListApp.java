package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
 public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>();
    // List<String> strings =  new LinkedList<>();

    strings.add("Diar Ihza");
    strings.add("Budi Awan");
    strings.add("Budi Awan2");

    strings.set(0, "Ihza");

    for (String string : strings) {
        System.out.println(string);
    }

    strings.remove("Ihza");

    System.out.println("New LIne");
    for (String string : strings) {
        System.out.println(string);
    }


 }   
}
