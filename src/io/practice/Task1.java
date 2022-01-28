package io.practice;

import java.io.*;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) throws IOException {
        char[] vowels = {'a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'};
        char[] vowelsRus = {'и', 'И','у', 'У', 'е', 'Е', 'ы', 'Ы', 'а', 'А', 'о', 'О', 'я', 'Я' };
        int c;
        boolean word = true;
        boolean firstLetter = true;
        boolean firstLetterIsVowel = false;

        File file = Path.of("resources1", "task1.txt").toFile();
        try(FileInputStream inputStream = new FileInputStream(file)) {
            char[] compareChar = vowels;
            byte[] bytes = new byte[inputStream.available()];
            byte currentByte;
            while((currentByte = (byte)inputStream.read()) != -1) {
                if(word) {
                    if(currentByte == ' ') {
                        System.out.print((char)currentByte);
                        word = false;
                        firstLetter = false;
                    }

                    if(firstLetter) {
                        for(int i = 0; i < compareChar.length; i++) {
                            if((char)currentByte == compareChar[i]) {
                                firstLetterIsVowel = true;
                                break;
                            }
                        }
                    }
                    if(word && firstLetterIsVowel) {
                        System.out.print((char)currentByte);
                        firstLetter = false;
                    }

                }
                else {
                    if(currentByte != ' ') {
                        word = true;
                        firstLetter = true;
                        firstLetterIsVowel = false;
                    }
                }
            }
        }
    }
}
