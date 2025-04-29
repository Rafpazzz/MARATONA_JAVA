package academy.devdojo.maratona_java.javacore.XRegex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Rafael, Paz, Moura";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
