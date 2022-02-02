package io.practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources1", "PublicTest.java");
        String stringValue = Files.readString(path);

        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("resources1", "PublicTest2.java");
        Files.writeString(resultPath, result);
    }
}
