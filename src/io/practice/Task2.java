package io.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {
    private static final String PUNCTUATION = ",!@#%&*>}<>~`";
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources1", "task1_1.txt");
        try (Scanner scanner = new Scanner(path)) {
            String previousWord = null;
            if(scanner.hasNext()) {
                previousWord = scanner.next().replaceAll(",!@#%&*>}<>~`","");
            }
            while(scanner.hasNext()) {
                String thisWord = scanner.next();
                thisWord = thisWord.replaceAll(PUNCTUATION,"");
                if(previousWord.toLowerCase().charAt(previousWord.length() - 1) == thisWord.toLowerCase().charAt(0))
                    System.out.println(previousWord);
                previousWord = thisWord;
            }
        }
    }
}
