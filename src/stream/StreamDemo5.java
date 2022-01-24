package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo5 {
    public static void main(String[] args) {
    List<Student> students = List.of(
            new Student(20, "Ivan"),
            new Student(18, "Petr"),
            new Student(27, "Vova"),
            new Student(23, "Sveta"),
            new Student(40, "Kira")
    );

    students.stream()
            .filter(student -> student.getAge() > 20)
            .map(Student::getName)
            .forEach(System.out::println);
    }
}
