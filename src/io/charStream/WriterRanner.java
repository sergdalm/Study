package io.charStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRanner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources1", "writer.poem").toFile();
        Path path = Path.of("resources1", "writer.poem");
        //try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
            fileWriter.append("Hello word!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }

        Path path2 = Path.of("resources1", "writer2.poem");
        Files.write(path2, List.of("Hello everyone!", "Good lock"));
    }
}
