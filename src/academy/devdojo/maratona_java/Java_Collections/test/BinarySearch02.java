package academy.devdojo.maratona_java.Java_Collections.test;

import academy.devdojo.maratona_java.Java_Collections.domain.Animes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch02 {
    public static void main(String[] args) {
        List<Animes> animes = new ArrayList<>();
        sortAnimeById sortAnimeById = new sortAnimeById();
        animes.add(new Animes(3L,"Pokemon",14.5));
        animes.add(new Animes(1L,"One Piece", 19.9));
        animes.add(new Animes(4L,"Dragon Ball Z",15.7));
        animes.add(new Animes(2L,"Naruto",18.9));
       // Collections.sort(animes);
        animes.sort(sortAnimeById);

        for(Animes anime : animes) {
            System.out.println(anime);
        }

        Animes animeToSearch = new Animes(1L, "One Piece", 19.9);
        System.out.println(Collections.binarySearch(animes,animeToSearch, sortAnimeById));
    }
}
