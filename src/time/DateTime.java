package time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(now.toInstant());
        System.out.println(now.toInstant().toEpochMilli());

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);
        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);

        System.out.println(now.getDayOfWeek());


        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);



    }
}
