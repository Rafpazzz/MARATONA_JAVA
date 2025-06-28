package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import academy.devdojo.maratona_java.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratona_java.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//References to a constructor
public class MEthodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserke", 43), new Anime("One Piece", 1130), new Anime("Naruto", 720)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (s,i) -> new Anime(s,i);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("boku no hero", 90));
        System.out.println(animeBiFunction.apply("Bleach", 450));
    }
}
