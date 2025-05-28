package Java_Collections.test;

import Java_Collections.domain.Animes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Animes> animes = new HashSet<>();
        animes.add(new Animes(3L, "Pokemon", 14.5, 0));
        animes.add(new Animes(1L, "One Piece", 19.9, 6));
        animes.add(new Animes(4L, "Dragon Ball Z", 15.7, 7));
        animes.add(new Animes(2L, "Naruto", 18.9, 0));

        for(Animes anime : animes ) {
            System.out.println(anime);
        }
    }
}
