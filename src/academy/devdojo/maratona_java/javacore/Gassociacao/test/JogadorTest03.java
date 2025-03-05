package academy.devdojo.maratona_java.javacore.Gassociacao.test;

import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratona_java.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cafú");
        Jogador j2 = new Jogador("Pele");
        Time t1 = new Time("Brasil");
        Jogador[] jogadores = {j1, j2};

        j1.setTime(t1);

        t1.setJogadores(jogadores);

        System.out.println("---jogador---");
        j1.imprime();

        System.out.println("---time---");
        t1.imprime();
        t1.getJogadores();
    }
}
