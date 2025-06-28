package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import academy.devdojo.maratona_java.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona_java.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//References to a no static method

public class MEthodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserke", 43), new Anime("One Piece", 1130), new Anime("Naruto", 720)));
        animeList.sort(animeComparators::compareByEpisodesNoStatic);
    }
}
