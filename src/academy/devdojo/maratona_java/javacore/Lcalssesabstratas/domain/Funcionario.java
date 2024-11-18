package academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bomus();
    }

    @Override
    public void imprime() {
        System.out.println("Ola mundo!!!!1");
    }

    @Override
    public void mostra() {
        //super.mostra();
        System.out.println("Mostrando...");
    }

    public abstract double bomus();
}
