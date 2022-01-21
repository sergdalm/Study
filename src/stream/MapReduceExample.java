package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                new Student(18, "Ivan"),
                new Student(20, "Petr"),
                new Student(25, "Dan"),
                new Student(30, "Vasya"),
                new Student(60, "Sveta"),
                new Student(45, "Kartya"),
                new Student(101, "Kira")
        )
                .sequential()
                //.flatMap(student -> student.getMarks().stream())
                //.map()
                //.filter(student -> student.getAge() < 18)
                .reduce(((student, student2) -> student.getAge() > student2.getAge() ? student : student2));

        maybeStudent.map(Student::getAge)
                //.filter(age -> age > 25)
                .flatMap(age -> Optional.ofNullable(null))
                .ifPresent(System.out::println);
    }
}
