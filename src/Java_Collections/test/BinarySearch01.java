package Java_Collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(3);

        //se nao encontrar o valor retorna (-(ponto de inserção(local onde deveria estar o objeto)) - 1). O -1 garante que so vai retornar um valor positivo se existir na lista
        //indes  0,1,2,3
        //values 0,2,3,4

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,1)); //retorna a posicao
    }
}
