package academy.devdojo.maratona_java.Generics.test;

import academy.devdojo.maratona_java.Java_Collections.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    //modo antigo de uso
    public static void main(String[] args) {
        //type erasure: apaga o tipo quando é compilado. I mean, quando o cogido é transformado em bityCodes o tipo é apagado
        List lista = new ArrayList();
        lista.add("Rafael");
        lista.add(123L);
        lista.add(new Consumidor("Rafael Paz"));

        for (Object o : lista) {
            if(o instanceof String) {
                System.out.println("String: " + o);
            }
            if(o instanceof  Long) {
                System.out.println("Long: " + o);
            }
        }


    }
}
