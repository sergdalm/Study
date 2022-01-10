package collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Murka", 2);
    Cat cat2 = new Cat("Marusya", 5);
    Cat cat3 = new Cat("Barsik", 3);
    Cat cat4 = new Cat("Shurik", 1);

    Queue<Cat> cats = new ArrayBlockingQueue<>(3);

    System.out.println(cats.add(cat3));
    System.out.println(cats.add(cat2));
    System.out.println(cats.add(cat4));
    System.out.println(cats.offer(cat1));


    System.out.println(cats.remove());
    System.out.println(cats.peek());
    System.out.println(cats);

    }


}
