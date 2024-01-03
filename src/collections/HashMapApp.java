package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.firstname", "Diar");
        map.put("name.lastname", "Uhza");

        System.out.println(map.get("name.firstname"));
         System.out.println(map.get("name.lastname"));
    
    }
}
