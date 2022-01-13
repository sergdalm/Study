package geekbrains.lesson5;

import java.sql.SQLOutput;
import java.util.*;

public class PhoneDic {
    Map<String, ArrayList<String>> hm;

    PhoneDic() {
        hm = new HashMap<>();
    }


    void add(String K, String V) {
        // Create list for every element
        if(hm.containsKey(K)) {
            hm.get(K).add(V);
        }
        else {
            ArrayList list = new ArrayList<String>();
            hm.put(K, list);
            hm.get(K).add(V);
        }
    }

    void get(String K) {
        if(hm.containsKey(K)) {
            ArrayList<String> list = hm.get(K);
            for (String s: list) {
                System.out.println(s);
            }
        }
    }
}
