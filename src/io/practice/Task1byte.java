package io.practice;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1byte {
    public static void main(String[] args) throws IOException {
        List<Character> vowelsList = new ArrayList<>(Arrays.asList('a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'));
        List<Character> vowelsRusList = new ArrayList<>(Arrays.asList('и', 'И','у', 'У', 'е', 'Е', 'ы', 'Ы', 'а', 'А', 'о', 'О', 'я', 'Я'));
        List<Character> punctuation = new ArrayList<>(Arrays.asList('!', '-', ',', '*', '(', ')', '$', ':'));

//        char[] vowels = {'a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'};
//        char[] vowelsRus = {'и', 'И','у', 'У', 'е', 'Е', 'ы', 'Ы', 'а', 'А', 'о', 'О', 'я', 'Я' };
//        boolean word = true;
        boolean firstLetter = true;
        boolean firstLetterIsVowel = false;

        File file = Path.of("resources1", "task1_1.txt").toFile();
        try(FileInputStream inputStream = new FileInputStream(file)) {
            //char[] compareChar = vowels;
            int currentByte;
            while((currentByte = inputStream.read()) != -1) {
                char currentChar = (char) currentByte;
                if(currentChar == ' ' || punctuation.contains(currentChar) ||
                        currentChar == '\n' || currentChar == '\r') {
                    if(firstLetterIsVowel)
                        System.out.print(" ");
                    firstLetter = true;
                    firstLetterIsVowel = false;
                }
                else {
                    if(firstLetter) {
                        if(vowelsList.contains(currentChar) || vowelsRusList.contains(currentChar)) {
                            firstLetterIsVowel = true;
                            firstLetter = false;
                        }
                    }
                    if(firstLetterIsVowel) {
                        System.out.print(currentChar);
                    }
                    else
                        firstLetter = false;
                }
            }
        }
    }
}
