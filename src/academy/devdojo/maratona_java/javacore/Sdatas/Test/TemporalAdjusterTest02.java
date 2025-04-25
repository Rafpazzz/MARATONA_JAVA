package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProxDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int prox = 1;
        switch (dayOfWeek) {
            case FRIDAY:
                prox = 3;
                break;
            case SATURDAY:
                prox = 2;
                break;

        }
        return temporal.plus(prox, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProxDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
