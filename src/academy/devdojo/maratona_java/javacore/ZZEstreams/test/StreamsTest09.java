package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(x -> x %2 == 0).forEach(x -> System.out.print(x +" "));
        System.out.println();
        IntStream.range(1, 50).filter(x -> x %2 == 0).forEach(x -> System.out.print(x +" "));
        System.out.println();

        Stream.of("rafael", " paz").map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        System.out.println();

        int num [] = {1,2,3,4,5};
        Arrays.stream(num).average().ifPresent(System.out::println);
    }
}
