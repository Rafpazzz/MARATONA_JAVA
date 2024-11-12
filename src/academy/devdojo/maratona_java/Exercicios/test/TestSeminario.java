package academy.devdojo.maratona_java.Exercicios.test;

import academy.devdojo.maratona_java.Exercicios.domain.Estudantes;
import academy.devdojo.maratona_java.Exercicios.domain.Local;
import academy.devdojo.maratona_java.Exercicios.domain.Professores;
import academy.devdojo.maratona_java.Exercicios.domain.Seminario;

public class TestSeminario {
    public static void main(String[] args) {
        Estudantes estudante1 = new Estudantes("Rafael", 20);
        Estudantes estudante2 = new Estudantes("Rafael", 20);
        Estudantes estudante3 = new Estudantes("Rafael", 20);
        Estudantes estudante4 = new Estudantes("Rafael", 20);
        Estudantes estudante5 = new Estudantes("Rafael", 20);
        Professores professor1 = new Professores("Aldir", "IA");
        Professores professor2 = new Professores("Thiago", "Engenharia de Dados");
        Local local = new Local("Fatima");
        Seminario seminario = new Seminario("Revolução Francesa");

        estudante2.setIdade(30);

        Estudantes[] estudantes1 = {estudante1, estudante2, estudante3,estudante4, estudante5};
        Professores[] professores = {professor1, professor2};

        seminario.setEstudante(estudantes1);
        seminario.setProf(professores);
        seminario.setLocal(local);

        seminario.imprime();
    }
}
