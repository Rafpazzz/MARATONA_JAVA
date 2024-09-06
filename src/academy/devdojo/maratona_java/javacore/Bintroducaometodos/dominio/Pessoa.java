package academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String nome;
    public char sexo;
    public int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}

