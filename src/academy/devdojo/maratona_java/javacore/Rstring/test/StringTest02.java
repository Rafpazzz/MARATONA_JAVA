package academy.devdojo.maratona_java.javacore.Rstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    rafael   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());//length de array é um atributo e o da string é um metodo, mas eles retornam a mesma coisa.
        System.out.println(nome.replace("r", "p"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,3));// o segundo parametro é subitraio 1 na contagem de indices da string.
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nome.trim());//apaga todos os espaços em branco do começo e do final da string.

    }
}
