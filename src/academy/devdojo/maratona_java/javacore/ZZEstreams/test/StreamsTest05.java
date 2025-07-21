package academy.devdojo.maratona_java.javacore.ZZEstreams.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Gomu", "Gomu", "Gomu", "No", "Mi");
        String[] split = stringList.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> collect = stringList.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(split);
        List<String> stringStream = stringList.stream().map(w -> w.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(stringStream);
    }
}
