package time.practice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task6 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.of("Africa/Cairo"));
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Africa/Cairo").getRules().getOffset(instant));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime2);
        ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(instant, ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime3);

    }

}
