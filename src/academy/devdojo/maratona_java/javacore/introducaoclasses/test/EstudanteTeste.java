package academy.devdojo.maratona_java.javacore.introducaoclasses.test;

import academy.devdojo.maratona_java.javacore.introducaoclasses.model.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante;
        estudante = new Estudante();
        estudante.idade = 21;
        estudante.nome = "Rafael";
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
