package academy.devdojo.maratona_java.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio.Pessoa02;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa02 pessoa = new Pessoa02();
       // pessoa.nome = "Jiraya";
       // pessoa.idade = 70;
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-9);

       // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
