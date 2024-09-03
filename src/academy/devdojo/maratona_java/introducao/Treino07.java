package academy.devdojo.maratona_java.introducao;

public class Treino07 {
    public static void main(String[] args) {
        int[] produto = {23,44,33,22,11,12,23,34,45,23};
        int soma = 0;
        for (int i = 0; i < produto.length; i++) {
            soma = soma + produto[i];
        }
        System.out.println("O valor a ser pago é "+ soma);
    }
}
