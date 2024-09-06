package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadora03 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        int[] num = {1,2,3,4,5};

        calcular.somaArra(num);
        calcular.somaVarargs(1,2,3,4,4,5,6,6,7);
    }
}
