package academy.devdojo.maratona_java.Generics.test;

import academy.devdojo.maratona_java.Generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenerico01 {
    public static void main(String[] args) {
        List<Carro> carroList = criarArrayObj(new Carro("Corolla"));
        System.out.println(carroList);
    }


    private static <T> List<T> criarArrayObj(T t) {
        return List.of(t);
    }

//    private static <T extends Comparable <T>> List<T> criarArrayObj(T t) {
//        return List.of(t);
//    }
}

