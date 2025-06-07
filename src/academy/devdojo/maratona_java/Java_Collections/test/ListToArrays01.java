package academy.devdojo.maratona_java.Java_Collections.test;

import java.util.*;

public class ListToArrays01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] listToArray = list.toArray(new Integer[0]); //com o 0 colocado nessa posição o java faz um refletion e decobre o tamanho do array

        Integer [] numeros = new Integer[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numeros);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("===============");
        System.out.println(arrayToList);
        System.out.println(Arrays.toString(numeros));

        System.out.println("===============");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeros)); //faz um clone do arrays original quebrando o vínculo com ele, assim factivel a modificaçoes.
        numerosList.add(19);
        System.out.println(numerosList);

        List<String> list1 = Arrays.asList("1", "2");
        List<Integer> integers = List.of(1, 2, 3);

    }
}
