package academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio;

public class ImprimeEstudante {

        private String pessoa;
        private int idade;


    public void imprime(Pessoa estudante){

        System.out.println("==================");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
        estudante.idade = 30;

    }
}
