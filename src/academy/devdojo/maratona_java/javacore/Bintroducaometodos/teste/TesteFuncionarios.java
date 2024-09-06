package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Funcionario;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario ficha = new Funcionario();
        double[] salario = {1450, 1596, 1234};

        ficha.nome= "Adir";
        ficha.idade = 45;
        //ficha.salarios = new double[]{1234, 5435, 345.6};

        ficha.salario(salario);
        ficha.imprime();
        System.out.println("=======================");
        ficha.imprime2();
        ficha.mediaSalarios();
    }
}
