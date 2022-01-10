package collections;

import java.util.*;

public class ArrayTask {

    public static void main(String[] args) {
        String[] array = {"A", "A", "B", "C", "C", "B", "A", "Z"};

        Set<String> lhs = new LinkedHashSet<>(Arrays.asList(array));

        System.out.println(lhs);

        Iterator<String> itr = lhs.iterator();


        while(itr.hasNext()) {
            String listS = itr.next();
            int n = 0;
            for(String s : array)
                if(s == listS)
                    n += 1;
            System.out.println(listS + " : " + n);
        }
    }

    public static class TestCollections {
        public static void main(String[] args) {
            // add: LinkedList 2 time faster
            // add at first place: LinkedList much faster
            // get: ArrayList much faster, LinkedList much longer
            List<Integer> linkedList = new LinkedList<>();
            List<Integer> arrayList = new ArrayList<>();
            measureTime(linkedList);
            measureTime(arrayList);



            String str = "A, B, C";
            char[] array =  new char[3];
            array[0] = 'a';
            array[1] = 'b';
            String strFromChar = new String(array);
            System.out.println(strFromChar);
        }

        private static void measureTime(List<Integer> list) {

            // This method returns current time in ms
            long start = System.currentTimeMillis();

            for(int i = 0; i < 100000; i++) {
                list.add(0, i);
            }

            long end = System.currentTimeMillis(); // 04:25

            System.out.println(end - start);
        }
    }
}