package academy.devdojo.maratona_java.javacore.Hheranca.domain;

//protecdet vai dar acesso a todas direto as variaveis de toda subclasse independeide onde tiver, porem as classes que estao no mesmo pacote vao ter acesso.

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estatico Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização noa estatico Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização noa estatico Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do contruto Funcionario");
    }

    public Funcionario(String nome, int CPF) {
        super(nome, CPF);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioSalario() {
        System.out.println("Eu " + this.nome + " recebi o salario " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
