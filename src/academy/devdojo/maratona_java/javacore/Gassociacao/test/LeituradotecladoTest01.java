package academy.devdojo.maratona_java.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituradotecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = input.nextLine();
        System.out.println("Escreva sua idade: ");
        int idade = input.nextInt();

        System.out.println("------------------");
        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.print("Idade: ");
        System.out.println(idade);
    }
}
