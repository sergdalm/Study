package mydatatypes;

// Demonstrate MyArrayList

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>();
        mal.add(54);
        mal.add(43);
        mal.add(50);
        System.out.println(mal.getSize());
        System.out.println(mal);
    }

}
