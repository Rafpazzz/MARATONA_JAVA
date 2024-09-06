package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Pessoa;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Pessoa estudante01 = new Pessoa();
        Pessoa estudante02 = new Pessoa();

        estudante01.nome = "Rafael";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
