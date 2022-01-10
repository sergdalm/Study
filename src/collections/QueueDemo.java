package collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.offer(3);
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(2);


        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("Head: " + queue.peek());


        while(!queue.isEmpty())
            System.out.print(queue.poll());

        System.out.println();*/

        Deque<Integer> aq = new ArrayDeque<>();
        aq.push(1);
        aq.add(4);
        aq.add(2);
        aq.add(0);
        aq.push(4);
        System.out.println(aq);

        Iterator<Integer> itr = aq.iterator();
        if(itr.hasNext())
            System.out.println(itr.next());

        while(!aq.isEmpty())
            System.out.print(aq.pollLast());
        System.out.println();


        while(!aq.isEmpty())
            System.out.print(aq.pop());

    }
}
