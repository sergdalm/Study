package io;
import java.io.File;
import java.util.*;

/***
 * This program calculates size of each folder in specified directory
 * and print int to the console.
 *
 * Usage:
 * Write an address of your directory
 * in final static String directoryName.
 *
 */
public class DirectoryDetector {
    static String documentsFolder = "C:/Users/Hello/Documents";
    static String helloFolder = "C:/Users/Hello";
    static String administrationFolder = "C:/Users/Hello/Desktop/관리팀";
    final static String directoryName = documentsFolder;

    public static void main(String[] args) {
        File directory = new File(directoryName);

        printSizeOfDirectoriesInTheDirectory(directory);
    }

    // Print name and size of each inner folder
    static public void printSizeOfDirectoriesInTheDirectory(File directory) {
        List<File> innerDirectories = new ArrayList<>(List.of(Objects.requireNonNull(directory.listFiles())));
        innerDirectories.sort((file1, file2) -> (int) (folderSize(file2) - folderSize(file1)));
        for (File innerDirectory : innerDirectories) {
            long directorySize = folderSize(innerDirectory);
            String directorySizeString = String.format("%,8d", directorySize);
            String folderName = innerDirectory.getName();
            System.out.printf("%-30.30s  %-30.30s%n",folderName, directorySizeString);
        }

        long length = folderSize(directory);
        System.out.print("The size of folder is ");
        System.out.format("%,8d%n%n", length);
    }

    // Calculate folder size
    public static long folderSize(File directory) {
        long length = 0L;

        if(directory.getName().endsWith(".lnk")) {
            return length;
        }
        if(directory.getName().startsWith(".")) {
            return length;
        }
        if(!directory.isDirectory()) {
            return directory.length();
        }
        try {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile())
                    length += file.length();
                else
                    length += folderSize(file);
            }
        } catch (NullPointerException exc) {
            // return 0L
        }

        return length;
    }
}
