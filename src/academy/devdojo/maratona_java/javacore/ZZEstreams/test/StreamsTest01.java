package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//order by title
//Retrieve this first 3 LightNovels with price less than 4

public class StreamsTest01 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game  no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> title = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            if(lightNovel.getPrice() <= 4) {
                title.add(lightNovel.getTitle());
            }
        }

        System.out.println(lightNovelList);
        System.out.println(title);
    }
}
