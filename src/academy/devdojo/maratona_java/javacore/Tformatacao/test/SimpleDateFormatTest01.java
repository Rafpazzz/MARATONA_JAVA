package academy.devdojo.maratona_java.javacore.Tformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "EEE hh:mm 'o''clock' a, zzzz"; //utiliza as aspas simples quando deseja que o SimpleDateFormat ignore a informação.
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));

    }
}
