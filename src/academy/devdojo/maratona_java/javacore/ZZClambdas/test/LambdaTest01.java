package academy.devdojo.maratona_java.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    //Consumer: executa uma operação e não retorna nada

    public static void main(String[] args) {
        List<String> stringList = List.of("Rafael", "Paz");
        //A interface funcional Consumer aceita um argumento e executa uma ação sobre ele, sem retornar valor.
        forEache(stringList, a -> System.out.println(a));

    }

    private static <T> void forEache(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
