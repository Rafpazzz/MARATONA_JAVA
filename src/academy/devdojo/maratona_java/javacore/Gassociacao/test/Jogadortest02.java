package academy.devdojo.maratona_java.javacore.Gassociacao.test;

import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pele");
        Time time = new Time("Brasil");

        j1.setTime(time);
        j1.imprime();
    }
}
