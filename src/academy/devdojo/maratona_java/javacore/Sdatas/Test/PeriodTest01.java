package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        LocalDate nowdt = LocalDate.now().plusYears(2).plusDays(10);
        Period p1 = Period.between(dt,nowdt);
        Period p2 = Period.ofWeeks(203);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Period.between(dt, dt.plusDays(p2.getDays())).getMonths());
        System.out.println(dt.until(dt.plusDays(p2.getDays()), ChronoUnit.DAYS));
    }
}
