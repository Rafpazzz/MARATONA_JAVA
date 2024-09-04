package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.model.Professor;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Goku";
        professor.idade = 36;
        professor.sexo = 'M';
        professor.rg = 1231233456;

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
        System.out.println(professor.rg);
    }
}
