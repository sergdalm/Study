package stream;

import org.w3c.dom.ls.LSOutput;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        List<String> strings = List.of("66", "11", "22", "33", "44", "55", "88");
//        IntSummaryStatistics intSummaryStatictics = strings.stream()
//                .map(string -> string + string)
//                .map(Integer::valueOf)
//                .filter(value -> value % 2 == 0)
//                .sorted()
//                .skip(1)
//                .limit(2)
//                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
//                .summaryStatistics();
//        System.out.println(intSummaryStatictics);
//                //.forEach(System.out::println);

//        IntStream.rangeClosed(1, 10)
//                        .forEach(System.out::println);
//
        IntStream.iterate(0, operand -> operand + 10000)
                .skip(10)
                //.limit(20)
                .forEach(System.out::println);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        Stream.of("23", "11", "34")
//                .peek(System.out::println)
//                .collect(Collectors.toList());

//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if(intValue % 2 == 0)
//                System.out.println(intValue);
//        }
    }
}
