package multithreading.queue;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Example of using ArrayBlockingQueue
public class CashboxRunnerBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Cashbox> cashboxes = new ArrayBlockingQueue<>(2, true, List.of(new Cashbox(), new Cashbox()));

        List<Thread>  threads= Stream.of(
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes),
                        new BuyerThreadBlockingQueue(cashboxes)
                )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
