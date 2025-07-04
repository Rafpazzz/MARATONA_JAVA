package academy.devdojo.maratona_java.javacore.XRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "ababababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regeex: " + regex);
        System.out.println("Posições ncontrada");

        while(matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
