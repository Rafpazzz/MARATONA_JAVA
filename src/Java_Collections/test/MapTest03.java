package Java_Collections.test;

import Java_Collections.domain.Animes;
import Java_Collections.domain.Consumidor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rafael");
        Consumidor c2 = new Consumidor("Paz");
        Animes a1 = new Animes(3L, "Pokemon", 14.5);
        Animes a2 = new Animes(1L, "One Piece", 19.9);
        Animes a3 = new Animes(4L, "Dragon Ball Z", 15.7);
        Animes a4 = new Animes(2L, "Naruto", 18.9);
        List<Animes> consumidor1List = List.of(a1,a3);
        List<Animes> consumidor2List = List.of(a2,a4);

        Map<Consumidor, List<Animes>> map = new HashMap<>();
        map.put(c1, consumidor1List);
        map.put(c2, consumidor2List);

        for(Map.Entry<Consumidor,List<Animes>> entry : map.entrySet()) {
            System.out.print(entry.getKey().getNome()+ ": ");
            for (Animes animes : entry.getValue()) {
                System.out.print(animes.getNome()+ "-");
            }
            System.out.println("");
        }

    }
}
