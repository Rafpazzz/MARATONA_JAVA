package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//order by title
//Retrieve this first 3 LightNovels with price less than 4

public class StreamsTest06 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no Life", 2.99),
            new LightNovel("Full Metal", 6.99),
            new LightNovel("Kumo desuga", 1.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 8)); //se existe algum lightNovel(objeto) > 8
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 0)); //perguntado se todos os objetos maiores do que 0
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() > 0)); //retorna true se nenhum objeto for maior do que 0
        lightNovelList.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);
        lightNovelList.stream().filter(ln -> ln.getPrice() < 3).findFirst().ifPresent(System.out::println);
    }
}
