package academy.devdojo.maratona_java.introducao;

import academy.devdojo.maratona_java.introducao.dominio.Calculadora;
import java.util.Scanner;

public class Treino09 {
    public static void main(String[] args) throws Exception {

        Calculadora calcular = new Calculadora();
        Scanner sc = new Scanner(System.in);
        char opcao;
        double num1, num2;

        System.out.println("Insira numero 1: ");
        num1 = sc.nextDouble();
        System.out.println("Insira numero 2: ");
        num2 = sc.nextDouble();

        System.out.println("===CALCULADORA===");
        System.out.println("Somar +");
        System.out.println("Subtrair -");
        System.out.println("Multiplicar *");
        System.out.println("Dividir /");
        System.out.println("RestoDivsao %");
        opcao = (char)System.in.read();

        switch (opcao){
            case '+':
                System.out.println(calcular.soma(num1,num2));
                break;
            case '-':
                System.out.println(calcular.subrati(num1,num2));
                break;
            case '*':
                System.out.println(calcular.multiplica(num1,num2));
                break;
            case '/':
                System.out.println(calcular.divide(num1,num2));
                break;
            case '%':
                System.out.println(calcular.restodiv(num1,num2));
                break;
            default:
                System.out.println("Valor invalido.");

        }

    }
}
