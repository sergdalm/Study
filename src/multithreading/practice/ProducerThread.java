package multithreading.practice;

import java.util.List;
import java.util.Random;

public class ProducerThread extends Thread{
    private List<Integer> list;
    private final Random random = new Random();
    private int count;

    public ProducerThread(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            if(count < 10) {
                int n = random.nextInt();
                list.add(n);
            }
        }

    }
}
