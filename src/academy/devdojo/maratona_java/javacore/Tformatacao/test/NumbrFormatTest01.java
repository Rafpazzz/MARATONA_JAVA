package academy.devdojo.maratona_java.javacore.Tformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumbrFormatTest01 {
    public static void main(String[] args) {
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleEUA = new Locale("en", "UE");
        NumberFormat[] num = new NumberFormat[3];

        num[0] = NumberFormat.getInstance();
        num[1] = NumberFormat.getInstance(LocaleEUA);
        num[2] = NumberFormat.getInstance(LocaleJP);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
