package academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }


    public void salario(double[] salario) {
        double salariov;
        salariov = 0;
        for (double num : salario) {
            salariov = +num;
        }
        salariov = salariov / 3;

        System.out.println("A media do salario: " + salariov);

    }

    public double[] salarios;

    public void imprime2() {
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + ", ");
            }
        }
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }
        double media;
        media = 0;

        for (double salario : salarios) {
            media = +salario;
        }

        media /= salarios.length;

        System.out.println("Media salarial: " + media);
    }
}
