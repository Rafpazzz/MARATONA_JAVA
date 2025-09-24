package academy.devdojo.maratona_java.Exercicios.test;

import java.util.Arrays;
import java.util.List;

public class Array_Test {
    public static void main(String[] args) {
        int [] arr = {8,5,7,1,4,9,2};

        List<Integer> list;
        list = Arrays.stream(arr).sorted().boxed().toList();
        System.out.println(list);

        String [] ar = {"rafael", "maria", "pedro", "ana"};

    }
}
