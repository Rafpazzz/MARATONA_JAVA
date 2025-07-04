package academy.devdojo.maratona_java.Java_Collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("teklado", "tecaldo");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2");

        for(String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("=============");

        for(String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("=============");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
