package academy.devdojo.maratona_java.introducao;
import java.io.IOException;
import java.util.Scanner;

public class Treino08 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Informe um numero= ");
        num1 = sc.nextDouble();
        System.out.print("Informe outro numero= ");
        num2 = sc.nextDouble();

        System.out.println("===CALCULADORA===");
        System.out.println("Somar +");
        System.out.println("Subtrair -");
        System.out.println("Multiplicar *");
        System.out.println("Dividir /");
        System.out.println("RestoDivsao %");
        char opcao = (char)System.in.read();

        switch (opcao){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
