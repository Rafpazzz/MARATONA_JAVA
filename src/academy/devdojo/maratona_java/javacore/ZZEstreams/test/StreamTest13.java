package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FENTASY),
            new LightNovel("Overlord", 3.99, Category.FENTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.ROMANCE),
            new LightNovel("No game  no Life", 2.99, Category.ROMANCE),
            new LightNovel("Full Metal", 6.99, Category.DRAMA),
            new LightNovel("Kumo desuga", 1.99, Category.FENTASY)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> promotionListMap = lightNovelList.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(promotionListMap);

        Map<Category, Map<Promotion, List<LightNovel>>> categoryMapMap = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));


    }
}
