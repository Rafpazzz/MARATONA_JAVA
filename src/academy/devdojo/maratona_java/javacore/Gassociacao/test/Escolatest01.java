package academy.devdojo.maratona_java.javacore.Gassociacao.test;

import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Escola;


public class Escolatest01 {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Jiraya");
        Professor prof2 = new Professor("Jiraya");
        Escola escola = new Escola("Konoha");
        Professor[] profesor = {prof1, prof2};

        escola.setProfessores(profesor);
        escola.imprime();
    }
}
