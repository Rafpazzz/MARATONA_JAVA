package Java_Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>();
        animes.add("One Piece");
        animes.add("Naruto");
        animes.add("Pokemon");
        animes.add("Dragon Ball Z");

        //ordenar/reorganizare a lista, se for String em ordem alfabetica, se for numeros em ordem crescente
        Collections.sort(animes);

        for(String anime : animes) {
            System.out.println(anime);
        }
    }
}
