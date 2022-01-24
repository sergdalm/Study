package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args)  {
        List<Double> myList = new ArrayList<>(Arrays.asList(7.0, 18.0, 10.0, 24.0, 17.0, 5.0));

        double productOfSqrRoots = myList.stream()
                .map(d -> Math.sqrt(d))
                .reduce(1.0, (a,b) -> a * b);
        System.out.println("Product of square roots is " + productOfSqrRoots);



    }
}
