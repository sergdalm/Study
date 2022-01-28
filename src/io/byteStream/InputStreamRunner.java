package io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {

        //File file = new File(String.join(File.separator, "resources", "text.txt"));
        File file = Path.of("resources1", "text.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);


//            byte[] bytes = InputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);

        }
    }
}
