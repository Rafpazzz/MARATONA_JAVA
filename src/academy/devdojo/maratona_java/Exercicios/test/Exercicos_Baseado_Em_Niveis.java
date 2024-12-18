package academy.devdojo.maratona_java.Exercicios.test;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicos_Baseado_Em_Niveis {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int num1, num2;
        int contCerta = 0;
        int contErrada = 0;
        int resposta;
        int numeroQuentoes = 0;
        int nivelExercicios = 0;

        System.out.println("Qual nivel de dificuldade deseja(1 a 4): ");
        nivelExercicios = input.nextInt();

        switch (nivelExercicios) {
            case 1:
                while (numeroQuentoes < 10) {
                    num1 = randomNumber.nextInt(11);
                    num2 = randomNumber.nextInt(11);

                    System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
                    resposta = input.nextInt();

                    if (resposta == num1 * num2) {
                        contCerta++;
                    }
                    numeroQuentoes++;
                }
                if (contCerta >= 7) {
                    System.out.println("Parabens, você esta pornto para avançar para o proximo nivel");
                } else {
                    System.out.println("Peça ajuda ao seu professor");
                }
                break;

            case 2:
                while(numeroQuentoes<10) {
                    num1 = randomNumber.nextInt(100);
                    num2 = randomNumber.nextInt(100);

                    System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
                    resposta = input.nextInt();

                    if(resposta == num1*num2) {
                        contCerta++;
                    }else{
                        contErrada++;
                    }
                    numeroQuentoes++;
                }
                if(contCerta >= 7) {
                    System.out.println("Parabens, você esta pornto para avançar para o proximo nivel");
                }else {
                    System.out.println("Peça ajuda ao seu professor");
                }
                break;

            case 3:
                while(numeroQuentoes<10) {
                    num1 = randomNumber.nextInt(1000);
                    num2 = randomNumber.nextInt(1000);

                    System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
                    resposta = input.nextInt();

                    if(resposta == num1*num2) {
                        contCerta++;
                    }else{
                        contErrada++;
                    }
                    numeroQuentoes++;
                }
                if(contCerta >= 7) {
                    System.out.println("Parabens, você esta pornto para avançar para o proximo nivel");
                }else {
                    System.out.println("Peça ajuda ao seu professor");
                }
                break;

            case 4:
                while(numeroQuentoes<10) {
                    num1 = randomNumber.nextInt(10000);
                    num2 = randomNumber.nextInt(10000);

                    System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
                    resposta = input.nextInt();

                    if(resposta == num1*num2) {
                        contCerta++;
                    }else{
                        contErrada++;
                    }
                    numeroQuentoes++;
                }
                if(contCerta >= 7) {
                    System.out.println("Parabens, você esta pornto para avançar para o proximo nivel");
                }else {
                    System.out.println("Peça ajuda ao seu professor");
                }
                break;

            default:
                System.out.println("Opção invalida");
                break;
        }

    }

}
