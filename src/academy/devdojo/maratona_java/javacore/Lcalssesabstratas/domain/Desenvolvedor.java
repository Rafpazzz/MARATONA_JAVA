package academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public double bomus() {
        return this.salario = this.salario + this.salario * 0.05;
    }

//    @Override
//    public void imprime() {
//
//    }
}
