package io.byteStream;


import java.io.*;
import java.nio.file.Path;

public class OutputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources1", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello world";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
