package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // not guarantee the order of its elements
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // insertion order
        Map<Integer, String> treeMap = new TreeMap<>(); // sorted by keys (natural ordering)

        testMap(treeMap);

    }

    static public void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(45, "Marry");
        map.put(30, "Steve");
        map.put(7, "Luise");
        map.put(78, "Mark");
        map.put(1500, "Bob");
        map.put(7, "Luise");


        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map);
    }
}
