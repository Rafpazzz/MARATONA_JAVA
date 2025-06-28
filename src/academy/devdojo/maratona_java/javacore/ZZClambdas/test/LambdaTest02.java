package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {

    //Function<T, R>: T->recebe R->Retorna

    public static void main(String[] args) {
        List<String> stringList = List.of("Rafael", "Paz");
        List<Integer> integerList = map(stringList, String::length);
        System.out.println(integerList);
        List<String> strings = map(stringList, s -> s.toUpperCase());
        System.out.println(strings);
    }

    private static <T,R> List<R> map(List<T> list, Function<T, R> funcTion) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = funcTion.apply(e);
            result.add(r);
        }

        return result;
    }
}
