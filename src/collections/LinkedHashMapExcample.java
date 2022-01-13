package collections;

import collections.equals.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExcample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");
        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
