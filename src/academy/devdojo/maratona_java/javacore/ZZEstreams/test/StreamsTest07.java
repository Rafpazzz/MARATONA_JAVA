package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import academy.devdojo.maratona_java.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;


//order by title
//Retrieve this first 3 LightNovels with price less than 4

public class StreamsTest07 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(2, (x, y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,Integer::sum));

        System.out.println("===================");

        integers.stream().reduce((x,y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("===================");

        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::max));

    }
}
