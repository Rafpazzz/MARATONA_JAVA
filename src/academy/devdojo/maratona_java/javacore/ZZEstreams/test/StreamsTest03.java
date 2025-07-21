package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game  no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);

        long count = stream.filter(s -> s.getPrice() <= 4).count();
        long count2 = lightNovelList.stream().distinct().filter(s -> s.getPrice() <= 4).count();
        System.out.println(count);
        System.out.println(count2);
    }
}
