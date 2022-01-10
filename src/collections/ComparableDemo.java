package collections;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Cat> catsList = new ArrayList<>();
        Set<Cat> catsSet = new TreeSet<>();
        addElements(catsList);
        addElements(catsSet);

        Collections.sort(catsList);
        System.out.println(catsList);
        System.out.println(catsSet);
    }

    public static void addElements(Collection collection){
        collection.add(new Cat("Murzik", 2));
        collection.add(new Cat("Barsik", 3));
        collection.add(new Cat("Nurik", 5));
        collection.add(new Cat("Zelendion", 2));
        collection.add(new Cat("Li", 2));
    }
}
