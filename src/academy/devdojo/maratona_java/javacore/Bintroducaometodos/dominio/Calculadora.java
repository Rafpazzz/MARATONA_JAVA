package academy.devdojo.maratona_java.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public double soma;

    public void somaDoinsNumeros() {
        System.out.println(10 + 10);
    }

    public void subitraiDoisNUmeros() {
        System.out.println(10 - 4);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividindoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividindoDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void imprimeDivisaoDeDoisNumeros2(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public int teste(int num1, int num2) {
        int soma;
        soma = num1 + num2;
        return soma;
    }

    public void somaArra(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //mudo o modo de chamada.

    public void somaVarargs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
