package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleDateTest01 {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt", "BR");
        Locale protugal = new Locale("en", "EUA");

        Calendar c1 = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, protugal);

        System.out.println("Brasil: " + df1.format(c1.getTime()));
        System.out.println("Portugal: " + df2.format(c1.getTime()));

        System.out.println(protugal.getDisplayCountry());

    }
}
