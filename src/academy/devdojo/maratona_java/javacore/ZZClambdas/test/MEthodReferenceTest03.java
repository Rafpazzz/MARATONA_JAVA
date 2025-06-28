package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


//References to an instance method of an arbitrary object of particular type
public class MEthodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rafael", "Paz", "Moura"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("20");
        System.out.println(num);

        BiPredicate<List<String>, String> checkList = List::contains;//mesma coisa do pradicate, a ddiferenca é que esse metodo recebe dois argumentos
        System.out.println(checkList.test(list, "Paz"));

    }
}
