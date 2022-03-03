package multithreading.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{
    private CountDownLatch countDownLatch;
    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Рфкета готовится к запуску...");
        try {
            countDownLatch.await();
            System.out.println("Пуск!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
