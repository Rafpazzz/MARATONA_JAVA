package academy.devdojo.maratona_java.javacore.Sdatas.Test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data  = new Date(1_000_000_000L); //long representando muilesegundos
        System.out.println(data);
    }
}
