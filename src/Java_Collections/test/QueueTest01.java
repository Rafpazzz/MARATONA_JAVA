package Java_Collections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("d");
        fila.add("a");
        fila.add("c");
        fila.add("e");
        fila.add("b");

//        for (String s : fila) {
//            System.out.println(s);
//        }
        //peek -> vai mostrar o primeiro elemento
        //poll -> pega o primeiro elemento e remove
        //offer -> parecido com o add, a diferença é o add retorna uma exceção quando a priorityqueue esta com um tamanho definido

        while(!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
