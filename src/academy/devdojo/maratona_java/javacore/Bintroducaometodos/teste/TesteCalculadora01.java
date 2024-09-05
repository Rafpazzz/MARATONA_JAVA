package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Calculadora;

public class TesteCalculadora01 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        calcular.multiplicaDoisNumeros(10, 20);

        int resultado = (int)calcular.dividindoDoisNumeros(20,2);

        System.out.println(resultado);

        calcular.imprimeDivisaoDeDoisNumeros(20, 0);
    }
}
