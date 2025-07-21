package academy.devdojo.maratona_java.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        //Eivtar o NullPointerException. Ou seja, ao inves de retrnar null retorna um Optional(retorno de um metodo Pode não vir)
        Optional<String> o1 = Optional.of("Rafael Paz");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("================");

        Optional<String> nameOptional = findName("Rafael");
        String empty = nameOptional.orElse("Nome não presente");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static Optional<String> findName(String name) {
        List<String> list = List.of("Rafael", "Paz");
        int i = list.indexOf(name);

        if(i != -1) {
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
