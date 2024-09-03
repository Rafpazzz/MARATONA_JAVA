package academy.devdojo.maratona_java.introducao;

public class Treino02 {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 22;
        int soma = numero1 + numero2;

        if (soma > 20){
            soma = soma + 8;
            System.out.println(soma);
        }else{
            soma = soma - 5;
            System.out.println(soma);
        }
    }
}
