package multithreading.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashboxes;

    public BuyerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
         try {
             cashboxes.acquire(); // получить монитор

             System.out.println(Thread.currentThread().getName() + " обслуживается в кассе в какой-то кассе");
             Thread.sleep(5L);
             System.out.println(Thread.currentThread().getName() + " освобождаю кассу какую-то кассу");

             cashboxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// This class demonstrates using of BlockingQueue for the same purpose as BuyerThread class.
class BuyerThreadBlockingQueue implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    BuyerThreadBlockingQueue(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }


    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take(); // не нужно делать wait() тк он сам ожидает пока не опявиться свободная касса
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
            cashboxes.add(cashbox);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
