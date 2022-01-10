package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("aaaaaaa");
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");
        animals.add("a");

        Collections.sort(animals, (o1, o2) -> {
                return o1.length() - o2.length();
        });

        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(numbers);

        // List of cats
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka", 2));
        cats.add(new Cat("Barsik", 5));
        cats.add(new Cat("Nina", 3));

        Collections.sort(cats, (o1, o2) -> {return o1.getAge() - o2.getAge();});
        System.out.println(cats);
    }
}
