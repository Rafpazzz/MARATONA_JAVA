package academy.devdojo.maratona_java.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratona_java.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("DBZ", "TV", 12, "Ação");
        anime.imprime();
    }
}
