package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FENTASY),
            new LightNovel("Overlord", 3.99, Category.FENTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.ROMANCE),
            new LightNovel("No game  no Life", 2.99, Category.ROMANCE),
            new LightNovel("Full Metal", 6.99, Category.DRAMA),
            new LightNovel("Kumo desuga", 1.99, Category.FENTASY)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        //codigo sem stream
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel novel : lightNovelList) {
            switch (novel.getCategory()) {
                case DRAMA: drama.add(novel); break;
                case FENTASY: fantasy.add(novel); break;
                case ROMANCE: romance.add(novel); break;
            }
        }

        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.FENTASY, fantasy);
        System.out.println(categoryLightNovelMap);

        //com stream

        Map<Category, List<LightNovel>> categoryListMap = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(categoryListMap);
    }
}
