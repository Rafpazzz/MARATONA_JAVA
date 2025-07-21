package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game  no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        List<String> listTilte = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))//orndemei a lista
                .filter(s -> s.getPrice() <= 4)//filtrei a lista
                .limit(3)//limitei o tamanho da lista
                .map(a -> a.getTitle())//mostar somente o titulo das LigthNovel
                .collect(Collectors.toList());//transformar em uma lista

        System.out.println(listTilte);
    }
}
