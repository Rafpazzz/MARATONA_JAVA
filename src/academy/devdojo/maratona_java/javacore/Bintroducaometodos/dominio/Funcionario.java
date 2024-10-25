package academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double media;
    private double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void imprime2() {
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + ", ");
            }
        }

        for(double salario : salarios){
            System.out.println(salario + " ");
        }
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;

        System.out.println("Media salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
