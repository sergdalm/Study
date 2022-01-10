package grokkingalgorithms;// Grokking algorithms 4.2, 4.3 (using Iterator instead of recursion)

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListOperationsDemo {
    public static void main(String[] args) {

        List<Double> dl = new LinkedList<>();
        dl.add(0.5);
        dl.add(1.0);
        System.out.println(ListOperationsDemo.sumDub(dl));

        List<Integer> il = new LinkedList<>();
        il.add(1);
        il.add(20);
        System.out.println(ListOperationsDemo.sumInt(il));
        System.out.println(ListOperationsDemo.greatestNum(il));

    }

    // Sum all numbers in Integer list
    static int sumInt(List<Integer> list) {
        Iterator itr = list.iterator();
        int sum = 0;
        while(itr.hasNext())
            sum += (int)itr.next();
        return sum;
    }

    // Sum all numbers in Double list
    static double sumDub(List<Double> list) {
        Iterator itr = list.iterator();
        double sum = 0;
        while(itr.hasNext())
            sum += (double)itr.next();
        return sum;
    }

    // Find the greatest number in the list
    static int greatestNum(List<Integer> list) {
        if(list.size() == 0)
            return 0;
        Iterator itr = list.iterator();
        int greatestNum = (int) itr.next();
        while(itr.hasNext()) {
            int n = (int)itr.next();
            if(n > greatestNum)
                greatestNum = n;
        }
        return greatestNum;

    }
}
