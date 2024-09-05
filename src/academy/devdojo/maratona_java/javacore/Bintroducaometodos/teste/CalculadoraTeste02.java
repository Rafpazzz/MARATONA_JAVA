package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        int a = 1;
        int b = 2;

        calcular.alteraDoisNumeros(a, b);
        System.out.println("Dntro do CalculadoraTeste02");
        System.out.println(a);
        System.out.println(b);

        System.out.println(calcular.teste(a,b));
    }
}
