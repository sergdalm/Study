package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> myList =  Arrays.asList(7, 18, 10, 24, 17, 5);

        System.out.print("Product as Optional: ");
        myList.parallelStream()
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::print);
        System.out.println();


        int product = myList.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println("Product as int: " + product);

        // Multiply only even values
        int evenProduct = myList.stream()
                .reduce(1, (a,b) -> {
                    if(b % 2 == 0) return a * b;
                    else return a;
                });
        System.out.println("Even product: " + evenProduct);
    }
}
