package academy.devdojo.maratona_java.Java_Collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");
        nomes.add("DevDojo Academy");

        for(String nome : nomes) {
            System.out.println(nome);
        }

    }
}
