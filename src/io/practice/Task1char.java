package io.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1char {
    private static final String VOWELS = "УуЕеЫыАаОоЭэЯяИиЮюEeUuOoAaIi";


    public static void main(String[] args) throws IOException {
        File file = Path.of("resources1", "task1_1.txt").toFile();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                List list = new ArrayList(Arrays.asList(line.split(" ")));
                Iterator<String> iter = list.iterator();
                while(iter.hasNext()) {
                    String word = iter.next();
                    if((word.length() > 0) && VOWELS.indexOf(word.charAt(0) ) != -1) {
                        System.out.println(word);
                    }

                }
            }
        }

    }
}
