package academy.devdojo.maratona_java.Exercicios.domain;

public class Pessoa {
    private String nome;
    private double altura;
    private char sexo;

    public Pessoa(String nome, double altura, char sexo) {
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public char getSexo() {
        return sexo;
    }
}
