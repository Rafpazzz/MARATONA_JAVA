package academy.devdojo.maratona_java.javacore.Lcalssesabstratas.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public double bomus() {
        return this.salario = this.salario + this.salario * 0.1;
    }

//    @Override
//    public void imprime() {
//
//    }
}
