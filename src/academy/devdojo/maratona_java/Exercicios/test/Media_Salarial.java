package academy.devdojo.maratona_java.Exercicios.test;

import java.util.Scanner;

public class Media_Salarial {
    public static void main(String[] args) {
        int numeroFuncionarios = 0;
        double salario_Funcionario = 0;
        double salarios = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero de funcionarios da empresa: ");
        numeroFuncionarios = input.nextInt();

        for(int i = 1; i<=numeroFuncionarios; i++) {
            System.out.print("Informe o primerio salario: ");
            salario_Funcionario = input.nextDouble();
            salarios += salario_Funcionario;
        }

        System.out.println("A media dos salarios de todos os funcionarios da empresa é "+ salarios/numeroFuncionarios);
    }
}
