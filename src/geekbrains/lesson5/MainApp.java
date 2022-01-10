package GeekBrains.lesson5;

import java.util.*;
import java.lang.*;

public class MainApp {
    public static void main(String args[]) {
        Map<String, String> hm = new HashMap<>();
        hm.put("Russia", "Moscow");
        hm.put("England", "London");
        hm.put("Germany", "Berlin");

        for(Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        hm.put("Germany", "Berlin2");
        System.out.println(hm.get("Germany"));

        Test test = new Test();
        test.add("A", "B", "C");
        test.show();

        ArrayList<Person> pArray = new ArrayList<>(Arrays.asList(new Person("Ivan", 30),
                new Person("Anna", 35),
                new Person("Misha", 15)));
        for(Person p : pArray) {
            System.out.println(p);
        }
        Collections.sort(pArray);
        System.out.println("=========");
        for(Person p : pArray) {
            System.out.println(p);
        }

        Set<String> hs = new HashSet<>();

        int i = 10; // 1010
        i = i >> 1; // 101
        System.out.println(i);

    }
}

class Test {
    List<String> al;

    Test() {
        al = new ArrayList<>();
    }

    void add(String ... s) {
        al.addAll(Arrays.asList(s));
    }

    void show() {
        System.out.println(al);
    }
}

class Person implements Comparable {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Object p) {
        return this.age - ((Person)p).age;
    }
}