package academy.devdojo.maratona_java.introducao;

public class Treino05 {
    public static void main(String[] args) {
        double nota = 7.7;

        if (nota >= 9) {
            System.out.println("A");
        }
        if (nota < 9 && nota >= 7) {
            System.out.println("B");
        }
        if (nota < 7 && nota >= 5) {
            System.out.println("C");
        }
        if (nota < 5 && nota >= 2.5) {
            System.out.println("D");
        } if (nota < 2.5){
            System.out.println("E");
        }
    }
}
