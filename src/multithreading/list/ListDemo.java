package multithreading.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

        ListThread listThread1 = new ListThread(integers);
        ListThread listThread2 = new ListThread(integers);
        ListThread listThread3 = new ListThread(integers);
        ListThread listThread4 = new ListThread(integers);
        ListThread listThread5 = new ListThread(integers);
        ListThread listThread6 = new ListThread(integers);
        ListThread listThread7 = new ListThread(integers);
        ListThread listThread8 = new ListThread(integers);
        ListThread listThread9 = new ListThread(integers);
        ListThread listThread10 = new ListThread(integers);
        ListThread listThread11 = new ListThread(integers);
        ListThread listThread12 = new ListThread(integers);
        ListThread listThread13 = new ListThread(integers);
        ListThread listThread14 = new ListThread(integers);
        ListThread listThread15 = new ListThread(integers);
        ListThread listThread16 = new ListThread(integers);
        ListThread listThread17 = new ListThread(integers);
        ListThread listThread18 = new ListThread(integers);
        ListThread listThread19 = new ListThread(integers);
        ListThread listThread20 = new ListThread(integers);
        ListThread listThread21 = new ListThread(integers);
        ListThread listThread22 = new ListThread(integers);
        ListThread listThread23 = new ListThread(integers);
        ListThread listThread24 = new ListThread(integers);
        ListThread listThread25 = new ListThread(integers);


        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();
        listThread7.start();
        listThread8.start();
        listThread9.start();
        listThread10.start();
        listThread11.start();
        listThread12.start();
        listThread13.start();
        listThread14.start();
        listThread15.start();
        listThread16.start();
        listThread17.start();
        listThread18.start();
        listThread19.start();
        listThread20.start();
        listThread21.start();
        listThread22.start();
        listThread23.start();
        listThread24.start();
        listThread25.start();

        listThread1.join();
        listThread2.join();
        listThread3.join();
        listThread4.join();
        listThread5.join();
        listThread6.join();
        listThread7.join();
        listThread8.join();
        listThread9.join();
        listThread10.join();
        listThread11.join();
        listThread12.join();
        listThread13.join();
        listThread14.join();
        listThread15.join();
        listThread16.join();
        listThread17.join();
        listThread18.join();
        listThread19.join();
        listThread20.join();
        listThread21.join();
        listThread22.join();
        listThread23.join();
        listThread24.join();
        listThread25.join();

        System.out.println(integers);
    }

}
