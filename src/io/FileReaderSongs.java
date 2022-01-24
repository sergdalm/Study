package io;

import javax.swing.text.Document;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class FileReaderSongs {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://lyric-text.ru/viktor-tsoy/alyuminievyie-ogurtsyi.html");
        Scanner sc = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext())
            sb.append(sc.next());

        String result = sb.toString();
        System.out.println(result);
        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents of the web page: "+result);
    }
}
