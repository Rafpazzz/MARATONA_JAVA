package academy.devdojo.maratona_java.javacore.Construtores.dominio.Teste;


import academy.devdojo.maratona_java.javacore.Construtores.dominio.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ", "touei");
        anime.init("DBZ", "TV", 12, "Ação");
        anime.imprime();
    }
}
