package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 21;
        estudante.nome = "Rafael";
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

        Estudante estudante1 = new Estudante();

        System.out.println(estudante1.idade);
        System.out.println(estudante1.nome);
        System.out.println(estudante1.sexo);

        Estudante [] estudante2 = new Estudante[3];

        estudante2[0].nome = "Ana";
    }
}
