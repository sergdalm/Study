package multithreading.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashboxRunner {
    public static void main(String[] args) throws InterruptedException {
        Semaphore cashboxes = new Semaphore(2);


        List<Thread>  threads= Stream.of(
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes)
        )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : threads) {
            thread.join();
        }
        
    }
}
