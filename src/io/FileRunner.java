package io;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println("getName: " + file.getName());
        System.out.println("getParent: " +  file.getParent());
        System.out.println("length: " + file.length());
        System.out.println("canExecute: " + file.canExecute());
        System.out.println("canRead: " + file.canRead());
        System.out.println("canWrite: " + file.canWrite());
        System.out.println(file.getAbsolutePath());

        File dir = new File("resources/test/dir");
        dir.mkdirs();
        System.out.println("dir.list: " + dir.list());

    }
}
