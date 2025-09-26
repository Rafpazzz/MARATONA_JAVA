package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FENTASY),
            new LightNovel("Overlord", 3.99, Category.FENTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.ROMANCE),
            new LightNovel("No game  no Life", 2.99, Category.ROMANCE),
            new LightNovel("Full Metal", 6.99, Category.DRAMA),
            new LightNovel("Kumo desuga", 1.99, Category.FENTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> categoryOptionalMap = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(categoryOptionalMap);

        Map<Category, LightNovel> categoryLightNovelMap = lightNovelList.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(categoryLightNovelMap);

        Map<Category, LightNovel> categoryLightNovelMap2 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(categoryLightNovelMap2);


//        long dramaCount = 0;
//        long fantasyCount = 0;
//        long romanceCount = 0;
//        for(LightNovel ln : lightNovelList) {
//            if(ln.getCategory().equals(Category.ROMANCE)) {
//                romanceCount++;
//            } else if (ln.getCategory().equals(Category.FENTASY)) {
//                fantasyCount++;
//            }else {
//                dramaCount++;
//            }
//        }
//
//        System.out.println("{Drama="+dramaCount+", Fantasy="+fantasyCount+", Romance="+romanceCount);
    }
}
