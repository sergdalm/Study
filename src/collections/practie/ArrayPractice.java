package collections.practie;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
        System.out.println(Methods.removeEven(list));
        System.out.println(Methods.countUnique(List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15)));

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("33", "three");
        map.put("4", "four");
        System.out.println(MapMethods.isUnic(map));

        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 8,
                2, 2,
                3, 2,
                4, 2
        );

        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                1, 8,
                2, 2,
                3, 2
        );

        MapMethods.exponentiationAdd(polynomial1, polynomial2);

    }
}

class Methods {
    // Get a list of integers and return a list
    // that contains only add numbers
    static List<Integer>  removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : list) {
            if(value % 2 != 0 )
                result.add(value);
        }

        return result;
    }

    // Get integer list and return a number of unique values
    static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}

class MapMethods {
    // Check if Map contains only unique values
    public static boolean isUnic(Map<String, String> map) {
        return map.size() == new HashSet(map.values()).size();
    }


    public static void exponentiationAdd(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Set<Integer> keys = new TreeSet<>(Comparator.reverseOrder());
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        List<String> list = new ArrayList<>(keys.size());

        for (Integer key : keys) {
            int num = map1.getOrDefault(key, 0) + map2.getOrDefault(key, 0);

            String value = (key == 0 ? String.valueOf(num) : num + "x^" + key);
            list.add(value);

        }
        System.out.println(String.join(" + ", list));

        Map<Integer, Integer> polynominalResult = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : polynominalResult.entrySet()) {
//        Integer value = polynominalResult.getOrDefault(entry.getKey(), 0);
//        polynominalResult.put(entry.getKey(), value + map1.getOrDefault(entry.getKey(), 0));
            // DON'T UNDERSTAND HOW THIS WORKS
            polynominalResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        System.out.println(polynominalResult);
    }
}