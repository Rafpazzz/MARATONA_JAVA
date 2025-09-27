package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FENTASY),
            new LightNovel("Overlord", 3.99, Category.FENTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.ROMANCE),
            new LightNovel("No game  no Life", 2.99, Category.ROMANCE),
            new LightNovel("Full Metal", 6.99, Category.DRAMA),
            new LightNovel("Kumo desuga", 1.99, Category.FENTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::gerPromotion, toSet())));

        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::gerPromotion, toCollection(LinkedHashSet::new))));

        System.out.println(collect2);
    }

    private static Promotion gerPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
