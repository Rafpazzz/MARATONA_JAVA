package academy.devdojo.maratona_java.javacore.XRegex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        System.out.println("Email valida: ");
        System.out.println("zoro@hotmal.br".matches(regex));
        String texto = "rafael@gamil.com, paz@gmail.com, #@zoro@hotmal.br, test@email.com.br, moura@email";
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regeex: " + regex);
        System.out.println("Posições ncontrada");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
