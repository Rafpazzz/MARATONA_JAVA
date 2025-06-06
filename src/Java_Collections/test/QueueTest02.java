package Java_Collections.test;

import Java_Collections.domain.Animes;
import Java_Collections.domain.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Animes> animes = new PriorityQueue<>();
        animes.add(new Animes(3L, "Pokemon", 14.5, 0));
        animes.add(new Animes(1L, "One Piece", 19.9, 6));
        animes.add(new Animes(4L, "Dragon Ball Z", 15.7, 7));
        animes.add(new Animes(2L, "Naruto", 18.9, 0));


        for (Animes anime : animes) {
            System.out.println(anime);
        }

    }
}
