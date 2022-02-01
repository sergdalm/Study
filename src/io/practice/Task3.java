package io.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources1", "task3.txt");
        Files.readAllLines(path).stream()
                .map(Task3::findMaxDigitsCount)
                .forEach(System.out::println);

    }

    private static Integer findMaxDigitsCount(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if(Character.isDigit(line.charAt(i))) {
                counter++;
            } else {
                result = Math.max(counter, result);
            }
            result = Math.max(counter, result);
        }
        return result;
    }
}
