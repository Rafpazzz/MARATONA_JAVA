package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Funcionario;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario ficha = new Funcionario();
        ficha.setNome("Pedro");
        ficha.setIdade(45);
        ficha.setSalarios(new double[]{123,3554,345.7});

        ficha.imprime();
        System.out.println("=======================");
        ficha.mediaSalarios();
        System.out.println("Media: " + ficha.getMedia());
    }
}
