package academy.devdojo.maratona_java.javacore.Tformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumbrFormatTest02 {
    public static void main(String[] args) {
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleEUA = new Locale("en", "US");
        NumberFormat[] num = new NumberFormat[3];

        num[0] = NumberFormat.getCurrencyInstance();
        num[1] = NumberFormat.getCurrencyInstance(LocaleEUA);
        num[2] = NumberFormat.getCurrencyInstance(LocaleJP);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String numSting = "R$ 10.000,21";
        try {
            System.out.println(num[0].parse(numSting));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
