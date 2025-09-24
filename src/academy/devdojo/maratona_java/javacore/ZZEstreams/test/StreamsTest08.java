package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest08 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game  no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        lightNovelList.stream().map(LightNovel::getPrice).filter(price -> price >3).reduce(Double::sum).ifPresent(System.out::println);

        //stream de tipos primitivos
        double sum = lightNovelList.stream().mapToDouble(LightNovel::getPrice).filter(ln -> ln > 3).sum();
    }
}
