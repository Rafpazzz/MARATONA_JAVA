package academy.devdojo.maratona_java.javacore.Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected int CPF;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco de inicialização estatico Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização noa estatico Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização noa estatico Pessoa 2");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do contruto Pessoa");
    }

    public Pessoa(String nome, int CPF) {
        this(nome);
        this.CPF = CPF;
    }

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
