package academy.devdojo.maratona_java.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        int dia;
        Scanner r = new Scanner(System.in);
        System.out.println("escreva numero: ");
        dia = r.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Doamingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção errada.");
                break;
        }
    }
}
