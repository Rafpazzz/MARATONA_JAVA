package Java_Collections.test;

import Java_Collections.domain.Animes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Animes> animes = new ArrayList<>();
        sortAnimeById sortAnimeById = new sortAnimeById();
        animes.add(new Animes(3L, "Pokemon", 14.5, 0));
        animes.add(new Animes(1L, "One Piece", 19.9, 6));
        animes.add(new Animes(4L, "Dragon Ball Z", 15.7, 7));
        animes.add(new Animes(2L, "Naruto", 18.9, 0));

//        Iterator<Animes> iterator = animes.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().getQuantidade() == 0) {
//                iterator.remove();
//            }
//        }

        animes.removeIf(anime -> anime.getQuantidade() == 0);

        System.out.println(animes);

    }
}
