package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import academy.devdojo.maratona_java.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona_java.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//References to a static method
public class MethodReferenceTest01 {

    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserke", 43), new Anime("One Piece", 1130), new Anime("Naruto", 720)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, (a1,a2)-> AnimeComparators.compareByTitle(a1,a2));
//        Collections.sort(animeList, AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
