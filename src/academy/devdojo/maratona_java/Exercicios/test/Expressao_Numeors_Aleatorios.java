package academy.devdojo.maratona_java.Exercicios.test;

import java.security.SecureRandom;
import java.util.Scanner;

public class Expressao_Numeors_Aleatorios {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Scanner input = new Scanner(System.in);

        String novaPergunta = "";
        int num1, num2;
        int contCerta = 0;
        int contErrada = 0;
        int resposta;

        System.out.println("Deseja esponder uma expressao?(sim/nao)");
        novaPergunta = input.nextLine();

        while(!novaPergunta.equalsIgnoreCase("nao")) {
            num1 = randomNumber.nextInt(11);
            num2 = randomNumber.nextInt(11);

            System.out.printf("Quanto é %d vezes %d?\n", num1, num2);
            resposta = input.nextInt();
            input.nextLine();// Consome o caractere de nova linha restante, para nao dar problemas com o next.Line().

            if(resposta == num1*num2) {
                contCerta++;
                System.out.println("Resposta certa!");
                switch(contCerta) {
                    case 1:
                        System.out.println("Muio bom");
                        break;

                    case 2:
                        System.out.println("Exelente");
                        break;

                    case 3:
                        System.out.println("Bom trabalho");
                        break;

                    case 4:
                        System.out.println("Mantenha um bom trabalho");
                        contCerta = 0;
                        break;
                }
                System.out.println("Deseja fazer um nova expressao? ");
                novaPergunta = input.nextLine();

            }else{
                while(resposta != num1*num2) {
                    contErrada++;
                    switch(contErrada) {
                        case 1:
                            System.out.println("Não. Por favor,tente novamente");
                            break;

                        case 2:
                            System.out.println("Errado. Tente mais uma vez");
                            break;

                        case 3:
                            System.out.println("Não desista");
                            break;

                        case 4:
                            System.out.println("Não. Continue tentado");
                            contErrada = 0;
                            break;
                    }
                    resposta = input.nextInt();
                    input.nextLine();
                }
                System.out.println("Resposta correta.");
                System.out.println("Deseja fazer um nova expressao?");
                novaPergunta = input.nextLine();
            }

        }
        System.out.println("Obrigado por participar");
    }
}
