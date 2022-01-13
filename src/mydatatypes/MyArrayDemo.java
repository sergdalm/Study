package mydatatypes;

// Demonstrate MyArrayList

public class MyArrayDemo {
    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(54);
//        mal.add(43);
//        mal.add(50);
//        System.out.println(mal.getSize());
//        System.out.println(mal);

        MyArrayList<String> list = new MyArrayList<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");

//        for (String value : list) {
//            System.out.println(value);
//        }
        list.iterator().forEachRemaining(System.out::println);



    }

}
