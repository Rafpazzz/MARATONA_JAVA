package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime anoversartio = LocalDateTime.of(2003, Month.DECEMBER, 4, 1,23,45);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(anoversartio, now));
    }
}
