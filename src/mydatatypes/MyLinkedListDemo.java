package mydatatypes;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<String> mll= new MyLinkedList<>();
        mll.add("Hello");
        mll.add("World");
        mll.add("!");
        System.out.println(mll);
        System.out.println(mll.getSize());
        System.out.println(mll.get(2));
        mll.remove(1);
        mll.remove(1);
        System.out.println(mll);
    }
}
