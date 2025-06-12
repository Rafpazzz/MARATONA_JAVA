package academy.devdojo.maratona_java.javacore.ZZAclassesInternas.test;

import academy.devdojo.maratona_java.Generics.domain.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {

    public static void main(String[] args) {
        List<Barco> barco = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
       // barco.sort((o1,o2) -> o1.getNome().compareTo(o2.getNome())); They're the same
        barco.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barco);
    }

}

