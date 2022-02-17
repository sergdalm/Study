package io.serialization;

import collections.equals.Person;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Path path = Path.of("resources1", "person1.out");
        //writeObject(path);

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object person = objectInputStream.readObject();
            System.out.println(person);

        } catch (IOException exc) {
            System.out.println("I/O Exception: " + exc);
            exc.printStackTrace();
        }

    }

    private static void writeObject(Path path) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        objectOutputStream.writeObject(ivan);

        } catch (IOException exc) {
            System.out.println("I/O Exception: " + exc);
        }
    }
}
