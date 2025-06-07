package academy.devdojo.maratona_java.Java_Collections.test;

import academy.devdojo.maratona_java.Java_Collections.domain.Smatphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smatphone s1 = new Smatphone("1NE35j", "IPhone");
        Smatphone s2 = new Smatphone("1NE35j", "IPhone");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }
}
