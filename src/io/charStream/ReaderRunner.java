package io.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources1", "text.txt").toFile();
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
//            String collect = fileReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(collect);
//        }

        Path path = Path.of("resources1", "text.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }

    }
}
