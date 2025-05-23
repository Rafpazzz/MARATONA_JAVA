package Java_Collections.test;

import Java_Collections.domain.Animes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortAnimeById implements Comparator<Animes> {

    @Override
    public int compare(Animes o1, Animes o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class ListSortTest01 {
    public static void main(String[] args) {
        List<Animes> animes = new ArrayList<>();
        animes.add(new Animes(3L,"Pokemon",14.5));
        animes.add(new Animes(1L,"One Piece", 19.9));
        animes.add(new Animes(4L,"Dragon Ball Z",15.7));
        animes.add(new Animes(2L,"Naruto",18.9));

        //ordenar/reorganizar a lista, se for ‘String’ em ordem alfabética, se for números em ordem crescente
        Collections.sort(animes);

        for(Animes anime : animes) {
            System.out.println(anime);
        }

        System.out.println("=================");

//        Collections.sort(animes, new sortAnimeById());
        animes.sort(new sortAnimeById());

        for(Animes anime : animes) {
            System.out.println(anime);
        }
    }
}
