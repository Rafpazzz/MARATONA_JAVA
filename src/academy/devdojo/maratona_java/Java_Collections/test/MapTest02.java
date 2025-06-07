package academy.devdojo.maratona_java.Java_Collections.test;

import academy.devdojo.maratona_java.Java_Collections.domain.Animes;
import academy.devdojo.maratona_java.Java_Collections.domain.Consumidor;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rafael");
        Consumidor c2 = new Consumidor("Paz");
        Animes a1 = new Animes(3L, "Pokemon", 14.5);
        Animes a2 = new Animes(1L, "One Piece", 19.9);
        Animes a3 = new Animes(4L, "Dragon Ball Z", 15.7);
        Animes a4 = new Animes(2L, "Naruto", 18.9);

        Map<Consumidor,Animes> map = new HashMap<>();
        map.put(c1,a1);
        map.put(c2,a4);

        for(Map.Entry<Consumidor, Animes> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }
    }
}
