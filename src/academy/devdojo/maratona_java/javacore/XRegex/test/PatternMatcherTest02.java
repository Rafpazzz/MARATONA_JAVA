package academy.devdojo.maratona_java.javacore.XRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //Metacaracteres
        // \\d = retorna todos os digitos(números)
        // \\D = retorn tudo o que nao for dígitos
        // \\s = todos os espaços em branco, tambem sao espaços em branco declarados na String ->  (\\t, \\n, \\f, \\r)
        // \\S = todos os espços nao brancos
        // \\w = tudo de a-z, digitos e _ (exclue os digitos expeciais)
        // \\W = tudo o que nao for no \\w
        String regex = "\\W";
        String texto2 = "ewlk@jr gh_4kjç5 1´~";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regeex: " + regex);
        System.out.println("Posições ncontrada");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
