package academy.devdojo.maratona_java.Java_Collections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();

        map.put("C","Letra C");
        map.put("A","Letra A");
        map.put("B","Letra B");
        map.put("E","Letra E");
        map.put("D","Letra D");

        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map.headMap("C"));//retorna tudo que esta acima dele.
        System.out.println(map.headMap("C", true));
        System.out.println(map.higherKey("A"));
    }
}
