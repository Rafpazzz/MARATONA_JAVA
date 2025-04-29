package academy.devdojo.maratona_java.javacore.XRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \\d = retorna todos os digitos(números)
        // \\D = retorn tudo o que nao for dígitos
        // \\s = todos os espaços em branco, tambem sao espaços em branco declarados na String ->  (\\t, \\n, \\f, \\r)
        // \\S = todos os espços nao brancos
        // \\w = tudo de a-z, digitos e _ (exclue os digitos expeciais)
        // \\W = tudo o que nao for no \\w
        // [] caracter de Renge(pega um renge de caracteres)
        //? Zero ou uma ocorencia
        //* Zero ou mais  ocorencia
        //+ uma ou mais ocorencias
        //{n,m} valor mais especifico
        //() agrupamento
        // | (ou) o(V|C)0 ovo | côco
        //$ represnta o fin da linha
        //. -> 1.3 = 123,133,1@3, 1A3.(entre 1 e 3)
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0X10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regeex: " + regex);
        System.out.println("Posições ncontrada");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }

        int numeroHexa = 0x59F86A; //retorna o valor decimal do numero
        System.out.println(numeroHexa);
    }
}
