package academy.devdojo.maratona_java.introducao;

public class Treino {
    public static void main(String[] args) {
        int contador = 0;
        String[] carros = {"Fusca", "Kombi", "Gol", "Ferrari"};
        for (String i : carros) {
            contador = ++contador;
        }
        System.out.println(contador);
    }

}