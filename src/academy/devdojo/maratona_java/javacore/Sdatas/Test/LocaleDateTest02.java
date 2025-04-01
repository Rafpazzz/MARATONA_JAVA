package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocaleDateTest02 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.MARCH, 31);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);

    }
}
