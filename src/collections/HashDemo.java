package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashDemo {
    public static void main(String[] args) {
        Map<Cat, String> map = new HashMap<>();
        Set<Cat> set = new HashSet<>();

        Cat cat = new Cat("Murka", 2);
        map.put(new Cat("Murka", 2), "Мурка");
        map.put(new Cat("Murka", 2), "Мурка2");

        set.add(new Cat("Murka", 2));
        set.add(new Cat("Murka", 2));

        System.out.println(map);
        System.out.println(set);

    }
}
