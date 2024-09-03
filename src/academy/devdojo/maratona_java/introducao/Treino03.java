package academy.devdojo.maratona_java.introducao;

public class Treino03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 2;

        if (a > b && a>c && b>c){
            System.out.println("O maior é A e C é o menor");
        } else if (a > b && a>c && c>b) {
            System.out.println("O maior é A e o menor é B");
        } else if (b>a && a>c && b>c) {
            System.out.println("MAior = B Menor= C");
        } else if (b>a && c>a && b>c) {
            System.out.println("Maior=B Menor=A");
        }else if (c>a && a>b && c>b){
            System.out.println("Maior=C Menor=B");
        }else {
            System.out.println("Maior=C Menor=A");
        }
    }
}
