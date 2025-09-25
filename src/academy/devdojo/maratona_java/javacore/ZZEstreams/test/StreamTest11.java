package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game  no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        double sum = lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum();

        returnMin();
        double average = lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().getAsDouble();
        System.out.println(average);
        System.out.println(sum);

        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining());
    }

    public static void returnMin() {
        lightNovelList.stream().mapToDouble(LightNovel::getPrice).min().ifPresent(System.out::println);
    }

    public static void returnMax() {
        lightNovelList.stream().mapToDouble(LightNovel::getPrice).max().ifPresent(System.out::println);
    }
}
