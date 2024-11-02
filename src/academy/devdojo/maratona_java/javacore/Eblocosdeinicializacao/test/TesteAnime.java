package academy.devdojo.maratona_java.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratona_java.javacore.Eblocosdeinicializacao.domain.Anime;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime1 = new Anime();

        for (int episodios : anime1.getEpisodios()) {
            System.out.print(episodios + " ");
        }

    }
}
