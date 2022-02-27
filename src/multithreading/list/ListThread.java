package multithreading.list;

import java.util.List;

public class ListThread  extends Thread{
    private final List<Integer> list;

    public ListThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (list) {
                list.add(i);
            }

        }
    }
}
