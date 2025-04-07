package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2025, Month.APRIL, 6);
        LocalTime time = LocalTime.parse("13:34:34");
        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        LocalDateTime atTime = date.atTime(time);
        System.out.println(atTime);
    }
}
