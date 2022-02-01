package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
        System.out.println("absolute: " + file.isAbsolute());
        System.out.println("file size: " + file.length() + " bytes");
        long fileSize = file.length();
        long fileFreeSpace = file.getFreeSpace();
        long totalSpace = file.getTotalSpace();
        System.out.println("free space: " + file.getFreeSpace());
        System.out.println("Total file space: " + (fileSize + fileFreeSpace));
        System.out.println("getTotalSpace: " + file.getTotalSpace());
        System.out.println("difference: " + (totalSpace - (fileSize + fileFreeSpace)));
        System.out.println("usable space: " + file.getUsableSpace());
        System.out.println("last modified: " + file.lastModified());

        File dir = new File("resources/test/dir");
        dir.mkdirs();
        System.out.println("dir.list: " + Arrays.toString(dir.list()));
    }
}
