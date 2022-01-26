package time.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// Find difference between two dates
public class Task4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018,7,7);
        Period period = Period.between(prevDate, now);
        System.out.println(period.toTotalMonths());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        long days = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(days);


    }
}
