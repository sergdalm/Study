package io.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources1", "task1_1.txt");
        try (Scanner scanner = new Scanner(path)) {
            String previousWord = null;
            if(scanner.hasNext()) {
                previousWord = scanner.next().replaceAll("\\p{P}", "");
            }
            while(scanner.hasNext()) {
                String currentWord = scanner.next();
                currentWord = currentWord.replaceAll("\\p{P}", "");
                // Check if last symbol of previous word equals first symbol of current word
                if(isEqualLastSymbolAndFirstSymbol(previousWord, currentWord)) {
                    System.out.println(previousWord);
                    System.out.println(currentWord);
                }
                previousWord = currentWord;
            }
        }
    }

    private static boolean isEqualLastSymbolAndFirstSymbol(String prev, String current) {
        return prev.toLowerCase().charAt(prev.length() - 1) == current.toLowerCase().charAt(0);
    }


}
