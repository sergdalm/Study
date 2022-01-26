package time.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.of(2020,6, 25, 19,47,0);
        LocalDateTime lt2 = lt.plusMonths(3L);


        System.out.println(lt2.toLocalDate());
        System.out.println(lt2.toLocalTime());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(lt2.format(formatter));
        System.out.println(lt2.toLocalDate() + " " + lt2.toLocalTime());
    }
}
