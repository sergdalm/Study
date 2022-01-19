package collections.practie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(Methods.addNumbersList(list));
    }
}

class Methods {
    // Get a list of integers and return a list
    // that contains only add numbers
    static List<Integer>  addNumbersList(List<Integer> list) {
        List<Integer> addList = new ArrayList<>(list);

        Iterator itr = addList.iterator();
        while(itr.hasNext()) {
            if((int)itr.next() % 2 == 0)
                itr.remove();

        }
        return addList;
    }

    // Get integer list and return a number of unique values
    static int countUnique(List<Integer> list) {
        Iterator itr = list.iterator();
        int count = 0;


        while(itr.hasNext()) {
            int n = (int) itr.next();
            if(!list.contains(n))
                count++;

        }
    }


}
