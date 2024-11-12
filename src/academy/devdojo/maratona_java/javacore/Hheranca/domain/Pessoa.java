package academy.devdojo.maratona_java.javacore.Hheranca.domain;

public class Pessoa {
    private  String nome;
    private int CPF;
    private Endereco endereco;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int gettCPF() {
        return CPF;
    }

    public void setCPF(int tCPF) {
        this.CPF = tCPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
