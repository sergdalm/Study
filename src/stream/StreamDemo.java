package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(7, 18,10, 24, 17, 5);

        System.out.println("Original list:" + myList);

        // Obtain a Stream to the ArrayList
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum values by use of min(),
        // max(), isPresent, and get().
        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("Minimum value: " + integer));

        System.out.print("Minimum value (my version): ");
        myList.stream()
                .reduce(Integer::min)
                .ifPresent(System.out::print);
        System.out.println();

        // Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the stream.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(integer -> System.out.println("Maximum value: " + integer));

        System.out.print("Minimum value (my version): ");
        myList.stream()
                .max(Integer::compare)
                .ifPresent(System.out::print);
        System.out.println();

        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();

        //Display sorted stream by use of forEach();
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Sorted stream (my version): ");
        myList.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values by use of filter().
        Stream<Integer> oddValues = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddValues.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Odd values (my version): ");
        myList.stream()
                .sorted()
                .filter((n) -> (n % 2) == 1)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display only odd values that greater than 5.
        System.out.print("Odd values greatest than 5: ");
        myList.stream()
                .sorted()
                .filter(n -> (n % 2) == 1)
                .filter(n -> n > 5)
                .forEach(n -> System.out.print(n + " "));
    }
}
