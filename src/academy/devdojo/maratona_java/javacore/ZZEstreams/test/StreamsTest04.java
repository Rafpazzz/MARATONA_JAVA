package academy.devdojo.maratona_java.javacore.ZZEstreams.test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graficDisigner = List.of("Rafael", "Paz", "Moura");
        List<String> developers = List.of("Pedro", "João", "Maria");
        List<String> students = List.of("Maria", "Clara", "Fabio");
        devDojo.add(graficDisigner);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("===============");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);//retirar um atributo de dentro de algum lugar

    }
}
