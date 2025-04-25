package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        LocalDateTime nowdt = LocalDateTime.now().plusYears(2);
        LocalTime lt = LocalTime.now();
        LocalTime nowlt = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(dt, nowdt);
        Duration d2 = Duration.ofDays(20);
        Duration d3 = Duration.between(lt, nowlt);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
