package Java_Collections.test;

import Java_Collections.domain.Animes;
import Java_Collections.domain.Smatphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smatphone> {
    @Override
    public int compare(Smatphone o1, Smatphone o2) {
        return o1.marca.compareTo(o2.marca);
    }
}

class AnimePrecoComoparator implements Comparator<Animes> {
    @Override
    public int compare(Animes o1, Animes o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smatphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smatphone smatphone1 = new Smatphone("1", "Nokia");
        set.add(smatphone1);

        NavigableSet<Animes> animes = new TreeSet<>(new AnimePrecoComoparator());
        animes.add(new Animes(3L, "Pokemon", 14.5, 0));
        animes.add(new Animes(1L, "One Piece", 19.9, 6));
        animes.add(new Animes(4L, "Dragon Ball Z", 15.7, 7));
        animes.add(new Animes(2L, "Naruto", 18.9, 0));
        for (Animes anime : animes) {
            System.out.println(anime);
        }

        //metodos de comparação
        //lower : retorna o menor dentrocda colecao
        //floor: retrona o elemento de mesmo valor que voce estapassando, se nao houver retorna o menor  logo em seguida
        //higher: retorna o maior dentro da coleção
        //ceiling: retorna o valor em consideração ao que voce esta passando

        Animes animes1 = new Animes(1L, "youyou", 14.5, 6);
        System.out.println("===============");
        System.out.println(animes.lower(animes1));
        System.out.println(animes.floor(animes1));
        System.out.println(animes.higher(animes1));
        System.out.println(animes.ceiling(animes1));


    }
}
