package stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>(Arrays.asList(1.1, 3.6, 9.2, 4.7, 12.1, 5.0));
        System.out.println("Original values in myList: ");
        myList.stream()
                .forEach(d -> System.out.print(d + " "));
        System.out.println();

        // Map the ceiling of the elements in myList to an IntStream.
        System.out.println("The ceiling of the values in myList: ");
        myList.stream()
                .mapToInt(d -> (int) Math.ceil(d))
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
