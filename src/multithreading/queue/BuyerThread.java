package multithreading.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
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
