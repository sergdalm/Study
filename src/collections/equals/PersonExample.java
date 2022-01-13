package collections.equals;

public class PersonExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person ivan2 = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
        System.out.println(ivan.equals(ivan2));

    }
}
