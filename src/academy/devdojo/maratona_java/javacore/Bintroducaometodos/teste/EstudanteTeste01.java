package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.ImprimeEstudante;
import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Pessoa;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Pessoa estudante01 = new Pessoa();
        Pessoa estudante02 = new Pessoa();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Rafael";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
