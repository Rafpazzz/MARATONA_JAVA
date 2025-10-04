package academy.devdojo.maratona_java.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumFor(num);
        System.out.println("---------");
        sumStreamInterate(num);
        System.out.println("---------");
        sumParalleStreamInterate(num);
        System.out.println("---------");
        sumLongStreamInterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sun For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) { //tem a melhor performance para esse tipo de operação em relação aos outros loops
            result += i;
        }
        long initEnd = System.currentTimeMillis();
        System.out.println(result + " " + (initEnd - init) + " ms");
    }

    private static void sumStreamInterate(long num) {
        System.out.println("Sun StreamInterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long initEnd = System.currentTimeMillis();
        System.out.println(result + " " + (initEnd - init) + " ms");
    }

    private static void sumParalleStreamInterate(long num) {
        System.out.println("Sun sumParalleStreamInterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long initEnd = System.currentTimeMillis();
        System.out.println(result + " " + (initEnd - init) + " ms");
    }

    private static void sumLongStreamInterate(long num) {
        System.out.println("Sun sumLongStreamInterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long initEnd = System.currentTimeMillis();
        System.out.println(result + " " + (initEnd - init) + " ms");
    }
}
