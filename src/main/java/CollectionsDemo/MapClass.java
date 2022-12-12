package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {

    public static void main(String[] args) {

        // Map is an Interface which HashMap is a class which implements Map Interface
        Map<String, String> map = new HashMap();

        map.put("name" , "Bachi");
        map.put("Actor", "Hari");
        map.put("Sports", "Cricket");

        // prints map in an inorder way as same like Set
        System.out.println(map);

        System.out.println();
        System.out.println("Using map.getKeys()");
        System.out.println();
        // Enhanced for loop
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        // Map.Entry is a way to collect the data in the HashMap
        Set<Map.Entry<String, String>> data = map.entrySet();

        System.out.println("Map.Entry Implementation");

        // Enhanced for loop using Map.Entry
        for(Map.Entry<String, String> d : data)
        {
            System.out.println(d.getKey() + ":" + d.getValue());
        }

    }

}
