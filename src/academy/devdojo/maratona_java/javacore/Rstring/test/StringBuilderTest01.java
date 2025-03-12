package academy.devdojo.maratona_java.javacore.Rstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "rafael";
        nome.concat("paz");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("rafel");//por padrão a capacidade é 16, vai dobrando a mediada que aumenta.
        sb.append(" paz");
        sb.delete(0,4);
        System.out.println(sb);
    }
}
